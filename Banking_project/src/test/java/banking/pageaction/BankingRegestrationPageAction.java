package banking.pageaction;

import banking.pagelocator.BankingRegestrationPageLocator;
import banking.utility.BankingBase;

public class BankingRegestrationPageAction extends BankingBase{
	
	BankingRegestrationPageLocator bankingRegestrationPageLocator = new BankingRegestrationPageLocator ();

	 public void BankingRegcard (String u ,String e ,String p) throws Exception {
		 Thread.sleep(5000);
		// bankingRegestrationPageLocator.Registration_User_Name.sendKeys("sdaadasdsad");
		 bankingRegestrationPageLocator.Registration_User_Name.sendKeys(u);
		 bankingRegestrationPageLocator.Registration_User_Email.sendKeys(e);	
		 bankingRegestrationPageLocator.Registraion_User_Password.sendKeys(p);
		 bankingRegestrationPageLocator.Registration_signUp.click();
		 
		 //
		}
     
	// public void alartt () {
	//	 driver.switchTo().alert().accept();
	 }
	 
	 
	//}
		
	

