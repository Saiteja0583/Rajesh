package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[2]")
	private WebElement pim;
	
	@FindBy(xpath ="//span[@class='oxd-userdropdown-tab']")
	private WebElement logdrop;
	
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logoutbutton;
	

	public WebElement getPim() {
		return pim;
	}
	
	public WebElement getLogdrop() {
		return logdrop;
	}


   public WebElement getLogoutbutton() {
		return logoutbutton;
	}







	public void pim()
	{
		pim.click();
	}
	
	
	public void logout()
	{
		logdrop.click();
		logoutbutton.click();
	}

}
