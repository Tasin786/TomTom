package com.next.itc.Automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class drop_demo {
    
	@Test
	public void taba () throws Exception {
		  System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");

			ChromeOptions lala = new ChromeOptions ();
			lala.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new ChromeDriver ()		;
		    driver.get("https://www.ebay.com/");  // for home page
			driver.manage().window().maximize();
			Select moyna = new Select(driver.findElement(By.id("gh-cat")));
			
		   (( JavascriptExecutor)driver).executeScript("scroll(0,600)");
			Thread.sleep(3000);
			//moyna.selectByValue("2984"); // if we faceing any issu with index number then we use it
		//	moyna.selectByVisibleText("Home & Garden");  // for visible text
			//moyna.selectByIndex(7); // for index number
			Thread.sleep(3000);

			driver.close();
	}

}
