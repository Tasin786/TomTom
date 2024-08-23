package banking.pageaction;

import banking.pagelocator.BankingAccountPagelocator;
import banking.pagelocator.BankingHomePageLocator;
import banking.utility.BankingBase;

public class BankingAccountPageAction extends BankingBase{
	
	BankingAccountPagelocator bankingAccountPagelocator = new BankingAccountPagelocator ();
       public void Bankingcard (String u ,String p) {
		
		bankingAccountPagelocator.Username.sendKeys(u);
		bankingAccountPagelocator.Userpassword.sendKeys(p);
		bankingAccountPagelocator.Userloginbutton.click();
	}
	
	
	
	

}
