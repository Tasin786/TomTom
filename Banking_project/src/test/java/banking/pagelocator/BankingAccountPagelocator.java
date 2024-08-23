package banking.pagelocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import banking.utility.BankingBase;

public class BankingAccountPagelocator extends BankingBase  {
   
	public BankingAccountPagelocator () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name =  "username")
	public WebElement Username;
	
	@FindBy(name =   "password")
	public WebElement Userpassword;
	
	@FindBy(name =  "login")
	public WebElement Userloginbutton;
	
	

	
}

