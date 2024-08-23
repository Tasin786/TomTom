package banking.pagelocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import banking.utility.BankingBase;

public class BankingProfilePagelocator extends BankingBase {
	
	public BankingProfilePagelocator () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//strong[text()='New Day'])[1]")
	public WebElement MyProfile;
	@FindBy(linkText  = "Logout")
	public WebElement LogOut;
	
	
}

