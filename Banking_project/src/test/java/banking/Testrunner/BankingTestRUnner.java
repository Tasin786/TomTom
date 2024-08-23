package banking.Testrunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import banking.utility.BankingBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resourcess/BangkingAllFeatures"},
plugin = {"json:target/cucumber.json"},// HTML report/test result
glue = "bankingStepDefination",tags ={"@nice"})

public class BankingTestRUnner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void BankingStartURL () {
		BankingBase Estart = new BankingBase ();
		Estart.BankingBrowserSetup();
	}
	@AfterTest
	public void BankingCloseBrowser () {
		BankingBase Estart = new BankingBase ();
		Estart.driver.quit();
	}
}
