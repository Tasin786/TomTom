package bankingStepDefination;

import banking.pageaction.BankingHomePageAction;
import banking.pageaction.BankingRegestrationPageAction;
import banking.utility.BankingTestData;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistrations {
	
	BankingRegestrationPageAction bankingRegestrationPageAction = new BankingRegestrationPageAction ();
	BankingHomePageAction bankingHomePageAction = new BankingHomePageAction ();
	
	@When("^Enter user name and password and Click registrations$")
	public void enter_user_name_and_password() throws Throwable {
		bankingRegestrationPageAction.BankingRegcard(BankingTestData.UserRegistration2,BankingTestData.UserRegistrationemail2,BankingTestData.UserRegistrationpass2);
		
	}

	@Then("^Verify  registrations successfully$")
	public void verify_registrations_successfully() throws Throwable {
		bankingHomePageAction.Verifyregistrationssuccessfully();
	}	
		
}