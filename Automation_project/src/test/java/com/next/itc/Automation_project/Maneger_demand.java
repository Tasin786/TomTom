package com.next.itc.Automation_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Maneger_demand {
     
	@Test 
	public void cool () {
		 System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
			ChromeOptions lala = new ChromeOptions ();
			lala.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new ChromeDriver ()		;
		    driver.get("https://www.demoblaze.com/");  // for home page
			driver.manage().window().maximize();
			
		    List<WebElement> allLink = driver.findElements(By.tagName("a"));  // this line for tagname find in list
		    System.out.println("Total link available here"+allLink.size());  // this line for find websides size that how many link they have
		    for(int i = 0; i<= allLink.size();i++) {   // this line java loop for order to print all available link
		    	System.out.println(allLink.get(i).getAttribute("href")); //href all link test have this name
		    	
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}
}
