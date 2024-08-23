package com.nice.lo.Goodjob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Black {

	public static void main(String[] args) throws Exception {
		Black.red();
	}

	public static void red () throws Exception {
		System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
		ChromeOptions lala = new ChromeOptions ();
		lala.addArguments("--remote-allow-origins-*");
	    WebDriver driver = new ChromeDriver ()		;
	    driver.get("https://www.demoblaze.com/");  // for home page
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("signInModalLabel")).click();  // for click home page
		
		driver.findElement(By.id("sign-username")).sendKeys("nice bag");   // for type email
		
		driver.findElement(By.id("sign-password")).sendKeys("12345");    // for type name
		
	//	driver.findElement(By.id("")).sendKeys("good morning");   // for type massage

		
		Thread.sleep(6000);
		driver.close();

	}

	

	


	}

