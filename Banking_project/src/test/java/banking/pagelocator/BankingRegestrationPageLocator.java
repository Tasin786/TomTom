package banking.pagelocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import banking.utility.BankingBase;

public class BankingRegestrationPageLocator extends BankingBase{

	public BankingRegestrationPageLocator () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id =  "reg_username")
	public WebElement Registration_User_Name;
	
	@FindBy(id =  "reg_email")
	public WebElement Registration_User_Email;
	
	@FindBy(id =  "reg_password")
	public WebElement Registraion_User_Password ;
	
	@FindBy(name =  "register")
	public WebElement Registration_signUp;
	
	
	
	
	
	
	
	
}


	
	
	
	

