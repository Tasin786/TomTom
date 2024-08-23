package banking.pageaction;

import static org.testng.Assert.assertTrue;

import banking.pagelocator.BankingAccountPagelocator;
import banking.pagelocator.BankingHomePageLocator;
import banking.utility.BankingBase;

public class BankingHomePageAction extends BankingBase {
	
	
   BankingHomePageLocator bankingHomePageLocator = new BankingHomePageLocator ();
	
	public void  Clickaccountlink () {
		bankingHomePageLocator.AccountLink.click();
	}
	
    public void Verifyregistrationssuccessfully () throws Exception {
    boolean verifyregistration = bankingHomePageLocator.Verify_Registration.isDisplayed();
    assertTrue(verifyregistration);
    
    Thread.sleep(6000);
    }
}
