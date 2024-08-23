package com.next.itc.Automation_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Multi_window {
	@Test
	public void hot () throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
			ChromeOptions lala = new ChromeOptions ();
			lala.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new ChromeDriver ()		;
		    driver.get("https://www.paychex.com/");  // for home page
			driver.manage().window().maximize();
			
			WebElement pogo = driver.findElement(By.linkText("Login")); // first window open
			pogo.click();
			
		   WebElement logo = driver.findElement(By.linkText("Paychex Flex login")); // secend window open
		   logo.click();
		   
		   Set <String> window = driver.getWindowHandles();  // for hndel windows
		   Iterator <String> good =  window.iterator();   // same
		   
		  String class1 = good.next();   // this are windows
		  String class2 = good.next();  // this are window
		  
		  Thread.sleep(3000);
		  driver.switchTo().window(class2);  // ordering to go this windows
		  
		  Thread.sleep(3000);
		  System.out.println("just check");  // we do it when some web side are close for automation
		  
		  driver.switchTo().window(class2);
		  
		  Thread.sleep(3000);
		  System.out.println("ok done");
		  
		  Thread.sleep(3000);

		  driver.quit();

		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
