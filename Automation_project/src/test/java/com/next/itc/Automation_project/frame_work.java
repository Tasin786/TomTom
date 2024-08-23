package com.next.itc.Automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class frame_work {

	@Test
	public void abid () throws Exception {
		  System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
			ChromeOptions lala = new ChromeOptions ();
			lala.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new ChromeDriver ()		;
		    driver.get("https://docs.oracle.com/javase/7/docs/api/index.html?overview-summary.html");  // for home page
			driver.manage().window().maximize();
			
			driver.switchTo().frame("classFrame");    // this line for find the frame that which part we want to work
			driver.findElement(By.linkText("Tree")).click();
			Thread.sleep(3000);
			driver.close();
	}
}
