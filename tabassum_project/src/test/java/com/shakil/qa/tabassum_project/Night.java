package com.shakil.qa.tabassum_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Night {

	public static void main(String[] args) throws Exception {
		Night obj = new Night ();
		obj.joy();
		
	}
    
	public void joy () throws Exception {
		System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
		ChromeOptions tom = new ChromeOptions ();
		tom.addArguments("--remote-allow-origins-*");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("recipient-email")).sendKeys("taba.com");

		driver.findElement(By.id("recipient-name")).sendKeys("tabassum");

	    driver.findElement(By.id("message-text")).sendKeys("Day-night");
	    
	    driver.findElement(By.xpath("//button[text()='Send message']")).click();
	    driver.switchTo().alert().accept();
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
