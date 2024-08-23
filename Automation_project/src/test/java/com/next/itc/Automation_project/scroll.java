package com.next.itc.Automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class scroll {

	@Test
	public void funtime () throws Exception {
		 System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
			ChromeOptions lala = new ChromeOptions ();
			lala.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new ChromeDriver ()		;
		    driver.get("https://www.demoblaze.com/");  // for home page
			driver.manage().window().maximize();
			driver.findElement(By.id("login2")).click();
			Thread.sleep(3000);

			driver.findElement(By.id("loginusername")).sendKeys("pinkredblack");
			driver.findElement(By.id("loginpassword")).sendKeys("78600");
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
			Thread.sleep(3000);
			boolean love = driver.findElement(By.xpath("//a[text()='Welcome pinkredblack']")).isDisplayed();
			Thread.sleep(3000);

			Assert.assertTrue(love);  //for verify the test case
			driver.close();
	}
}
