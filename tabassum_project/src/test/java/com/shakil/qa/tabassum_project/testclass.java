package com.shakil.qa.tabassum_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testclass {

	public static void main(String[] args) {
		testclass obj = new testclass();
		obj.tom();
		

	}
	
		
		public void tom () {
			  System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
			 //org.openqa.selenium.chrome.ChromeOptions opp = new org.openqa.selenium.chrome.ChromeOptions();
			  ChromeOptions opp = new ChromeOptions();
			 opp.addArguments("--remote-allow-origins-*");
			WebDriver driver = new ChromeDriver();
				driver.get("https://www.demoblaze.com/");
	}

}
