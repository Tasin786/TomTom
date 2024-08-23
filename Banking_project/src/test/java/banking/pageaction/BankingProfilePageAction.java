package banking.pageaction;

import org.testng.Assert;

import banking.pagelocator.BankingProfilePagelocator;
import banking.utility.BankingBase;

public class BankingProfilePageAction extends BankingBase {
	
	BankingProfilePagelocator bankingProfilePagelocator = new BankingProfilePagelocator ();

	public void verify_user_login_successfully () throws Exception {
		Thread.sleep(3000);
		boolean ProfileVerification = bankingProfilePagelocator.MyProfile.isDisplayed();
		Assert.assertTrue(ProfileVerification);
		
		bankingProfilePagelocator.LogOut.click();
		
		
		
	}
}
