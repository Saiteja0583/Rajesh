package ObjectRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class emplist {
	
	public emplist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='oxd-table-body']/div/child::div[1]/div[@class='oxd-table-cell oxd-padding-cell'][*]")
	 private List<WebElement> table;
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement searchinput;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchButton;

	public List<WebElement> getTable() {
		return table;
	}

	public WebElement getSearchinput() {
		return searchinput;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	

}
