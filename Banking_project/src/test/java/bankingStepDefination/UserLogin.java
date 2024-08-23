package bankingStepDefination;

import banking.pageaction.BankingAccountPageAction;
import banking.pageaction.BankingHomePageAction;
import banking.pageaction.BankingProfilePageAction;
import banking.utility.BankingBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserLogin extends BankingBase{
	
	BankingProfilePageAction bankingProfilePageAction = new BankingProfilePageAction ();
	BankingHomePageAction bankingHomePageAction = new BankingHomePageAction ();
	BankingAccountPageAction bankingAccountPageAction = new BankingAccountPageAction ();
	
	
	@Given("^Open banking \"([^\"]*)\" application$")
	public void open_banking_application(String URL) throws Throwable {
		BankingUrlSetup(URL);
		
	}


	@When("^Click account link$")
	public void click_account_link() throws Throwable {
		bankingHomePageAction.Clickaccountlink();
	}

	@When("^Enter user name and password and Click login$")
	public void enter_user_name_and_password_and_Click_login() throws Throwable {
		bankingAccountPageAction.Bankingcard(Bankingprop.getProperty("BankingUsername1"),Bankingprop.getProperty("Bankingpassword1") );
	}


	

	@Then("^verify user login successfully$")
	public void verify_user_login_successfully() throws Throwable {
		
		bankingProfilePageAction.verify_user_login_successfully();
		
		
	  	}


}
