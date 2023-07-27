package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.property;

public class loginpage {
	property po = new property();
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//input[@name='username']") 
	 private WebElement userN;
	
	
	@FindBy(xpath = "//input[@name='password']")
	 private WebElement passW;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;

	public WebElement getUserN() {
		return userN;
	}

	public WebElement getPassW() {
		return passW;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	public void username() throws Throwable
	{
		
	  String user =po.login("username");
		userN.sendKeys(user);
		
	}
	
	public void password() throws Throwable
	{
		String pas = po.login("password");
		
		 passW.sendKeys(pas);
	}
	
	public void loginbutton()
	{
		loginbutton.click();
	}
	
	
	
	
	

}
