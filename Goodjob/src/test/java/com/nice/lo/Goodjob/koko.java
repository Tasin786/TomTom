package com.nice.lo.Goodjob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class koko {
   @Test
   public void taba () throws Exception {
	   System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
		ChromeOptions lala = new ChromeOptions ();
		lala.addArguments("--remote-allow-origins-*");
	    WebDriver driver = new ChromeDriver ()		;
	    driver.get("https://www.demoblaze.com/");  // for home page
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("sign-username")).sendKeys("pinkredblack");
		
		driver.findElement(By.id("sign-password")).sendKeys("78600");
		
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		Thread.sleep(3000);

		
	    driver.switchTo().alert().accept();// if simething popup on the screen then we use it

	 
		Thread.sleep(3000);

		
		driver.close();
		
}

   }
