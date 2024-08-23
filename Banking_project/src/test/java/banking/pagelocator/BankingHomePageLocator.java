package banking.pagelocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import banking.utility.BankingBase;

public class BankingHomePageLocator extends BankingBase {
	
	public  BankingHomePageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText  = "Account")
	public WebElement AccountLink;
	
	
	@FindBy(xpath =  "(//a[text()='Home'])[1]")
	public WebElement Verify_Registration;
}


