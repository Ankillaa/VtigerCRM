package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformation {
	@FindBy(xpath = "//span[@class='dvHeaderText']")private WebElement orgInfo;
	
	public  OrganizationInformation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgInfo() {
		return orgInfo;
	}
	

}
