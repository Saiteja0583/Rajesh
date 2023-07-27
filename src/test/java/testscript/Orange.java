package testscript;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ListIterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import GenericUtility.Excel;
import GenericUtility.property;
import ObjectRepo.addemp;
import ObjectRepo.emplist;
import ObjectRepo.homepage;
import ObjectRepo.loginpage;
import ObjectRepo.pimpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {
	
	
	public static void main(String[] args) throws Throwable {
	   
	    
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();
	  
	  property po = new property();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	 
	  String ur =  po.login("url");
	  
	  driver.get(ur);
	  
	  
	  driver.manage().window().maximize();
	  
		  
	  //login page 
	  loginpage lp = new loginpage(driver);
	  addemp ae = new addemp(driver);
	  Excel ex = new Excel();
	  pimpage pp = new pimpage(driver);
	  emplist emp = new emplist(driver);
	  
	  
	  lp.username();
	  lp.password();
	  lp.loginbutton();
	  
	  //dashboard page 
	  homepage hp = new homepage(driver);
	  
	  // mouse hover to pim
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(hp.getPim());
	  
	  // clicking on pim
	  
	  hp.pim();
	  
	  // adding employee details
	  
	
	  // click on add employee
	 pp.addemp();
	  
	 // DDT- Reading data from external resource- Excel
	  for(int i = 1; i<=3; i++)
	  {  
		  String first = ex.excel(i, 0);
	       ae.getFirstN().sendKeys(first);
	       
		       for(int j=0; j<=1; j++)
		       {
			  String last = ex.excel(i, j);
			  ae.getLastN().sendKeys(last);
		        }
		  
		  // click on submit details
		  ae.getSubmit().click();
		  
		  // clicking on add employee list page
		  
		  pp.addemp();
		  // clicking on employee list page
	      pp.emplist();
	      
	      Thread.sleep(3000);
	      
	      //scrolling down
	      
	      JavascriptExecutor jse = (JavascriptExecutor)driver;
	      
	      jse.executeScript("windows.scrollTo(0,document.body.scrollHeight);", "");
	      
	      
	      
	      
	      ListIterator li = emp.getTable().listIterator();
	      
	      while(li.hasNext())
	      {
	    	  String el = li.toString();
	    	  
	    	  if(el.equalsIgnoreCase(first))
	    	  {
	    		   System.out.println("Employee Name"+ el);
	    	  }
	      }
	      
	      
	  
	     } 
	  
	  // logout application
	         hp.logout();
	  
	  
	  
	  
	  }
}
