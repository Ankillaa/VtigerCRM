package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createOrganizationPage {
	@FindBy(xpath = "//input[@name='accountname']")private WebElement OrgNameTxt;
	@FindBy(xpath = "//select[@name='industry']")private WebElement IndustryDrDown;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")private WebElement SaveBtn;
	
	public createOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgNameTxt() {
		return OrgNameTxt;
	}

	public WebElement getIndustryDrDown() {
		return IndustryDrDown;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	

}
