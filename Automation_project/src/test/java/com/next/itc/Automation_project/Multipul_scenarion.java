package com.next.itc.Automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Multipul_scenarion {
    
	@Test
	public void love () throws Exception {
		 System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
			ChromeOptions lala = new ChromeOptions ();
			lala.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new ChromeDriver ()		;
		    driver.get("https://www.dell.com/");  // for home page
			driver.manage().window().maximize();
			WebElement lion = driver.findElement(By.id("mh-search-input"));
			lion.sendKeys(Keys.SHIFT,"monitor");
			lion.sendKeys(Keys.ENTER);
			
			Thread.sleep(5000);
			driver.close();
	}
}
