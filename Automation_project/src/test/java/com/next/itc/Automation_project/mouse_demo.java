package com.next.itc.Automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouse_demo {
	
	@Test
	public void good () throws Exception {
		  System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
			ChromeOptions lala = new ChromeOptions ();
			lala.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new ChromeDriver ()		;
		    driver.get("https://www.dell.com/");
		    driver.manage().window().maximize();
			Thread.sleep(3000);

			Actions tuntuni = new Actions(driver);   // Action class or mouse over
			tuntuni.moveToElement(driver.findElement(By.xpath("//span[text()='Deals']"))).build().perform();
			driver.findElement(By.linkText("Dell Rewards")).click();
			Thread.sleep(3000);
			driver.close();
	}

}
