package steps_defi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class steps_write_here {
	@Given("^open our application$")
	public void open_our_application() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
		ChromeOptions lala = new ChromeOptions ();
		lala.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver ()		;
	    driver.get("https://www.demoblaze.com/"); 
	    Thread.sleep(3000);// for home page
		driver.manage().window().maximize();
	}
	@When("^Enter Monitor in search field$")
	public void enter_Monitor_in_search_field() throws Throwable {
	   
	}


}
