package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addemp {
	
	public addemp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstN;
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement LastN;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	public WebElement getFirstN() {
		return firstN;
	}


	public WebElement getLastN() {
		return LastN;
	}


	public WebElement getSubmit() {
		return submit;
	}


}
