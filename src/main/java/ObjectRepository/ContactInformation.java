package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {
	@FindBy(xpath = "//input[@name='firstname']")private WebElement conFirstNametxt;
	@FindBy(xpath = "//input[@name='lastname']")private WebElement conLastNameTxt;
	@FindBy(xpath = "(//img[@title='Select'])[1]")private WebElement orgNameLookup;
	@FindBy(xpath = "(//*[@title='Save [Alt+S]'])[1]")private WebElement conSaveBtn;
	
	public ContactInformation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getConFirstNametxt() {
		return conFirstNametxt;
	}

	public WebElement getConLastNameTxt() {
		return conLastNameTxt;
	}

	public WebElement getOrgNameLookup() {
		return orgNameLookup;
	}

	public WebElement getConSaveBtn() {
		return conSaveBtn;
	}
	
	

}
