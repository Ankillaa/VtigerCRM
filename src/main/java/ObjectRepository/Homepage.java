package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	//declarations
	
	@FindBy(xpath = "(//a[text()='Organizations'])[1]") private WebElement orgLink;
	@FindBy(xpath = "(//*[text()='Contacts'])[1]") private WebElement contactLink;
	@FindBy(xpath = "(//*[text()='Opportunities'])[1]") private WebElement opportinutyLink;
	@FindBy(xpath = "(//td[@class='small'])[2]") private WebElement adminImg;
	@FindBy(xpath = "(//a[@class='drop_down_usersettings'])[2]") private WebElement signOutLink;  
	

//constructor
public Homepage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public WebElement getOrgLink() {
	return orgLink;
}


public WebElement getContactLink() {
	return contactLink;
}


public WebElement getOpportinutyLink() {
	return opportinutyLink;
}


public WebElement getAdminImg() {
	return adminImg;
}


public WebElement getSignOutLink() {
	return signOutLink;
}






}
