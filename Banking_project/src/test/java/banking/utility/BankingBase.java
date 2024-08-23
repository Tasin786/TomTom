package banking.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BankingBase {
   public static WebDriver driver;
   public static Properties Bankingprop;
   // Constructor
   public BankingBase () {
	   try {
		FileInputStream BankingFile = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\banking\\configuration\\BankingConfiguration.properties");
		   Bankingprop = new Properties ();
		   Bankingprop.load(BankingFile);
	} catch (FileNotFoundException e) {
		System.out.println("Please fixed your constructor");
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	   
	   
	   
	   
   }
   // Browser Setup
   
   public void BankingBrowserSetup () {
	 String BankingallBrowser = Bankingprop.getProperty("BankingBrowser1");
	 if(BankingallBrowser.equals("Chrome")) {
		 //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\BankingDriver\\chromedriver.exe");
		 System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+ "\\EdgeDriver\\msedgedriver.exe");
			//ChromeOptions lala = new ChromeOptions ();
			//lala.addArguments("--remote-allow-origins=*");
		    //WebDriver driver = new ChromeDriver ()		;
		    
			EdgeOptions op = new EdgeOptions();
			op.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(BankingUtility.implicitlyWait));
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(BankingUtility.pageLoadTimeout));
		    driver.manage().deleteAllCookies();
		    
	 }
	 else if (BankingallBrowser.equals("IE")) {
		 
	 }
   }
   //LunchUrl Setup
   public static void BankingUrlSetup (String URL) {
	   driver.get(Bankingprop.getProperty("BankingURL1"));
	   //driver.get("https://askomdch.com/");
   }
   
   
}
