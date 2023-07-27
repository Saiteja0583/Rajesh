package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pimpage {
	
	
	public pimpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Employee List']")
	 private WebElement emplist;
	
	
	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addemp;
	
	
	

	public WebElement getEmplist() {
		return emplist;
	}


	public WebElement getAddemp() {
		return addemp;
	}


	
	
	
	
	public void emplist()
	{
		emplist.click();
	}
	
	public void addemp()
	{
		addemp.click();
	}

}
