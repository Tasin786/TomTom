package Step_defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Our_step_defenation {
	public static WebDriver driver;
	@Given("^open our application$")
	
	public void open_our_application() throws Throwable {
		  System.setProperty("webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
			ChromeOptions lala = new ChromeOptions ();
			lala.addArguments("--remote-allow-origins=*");
		     driver = new ChromeDriver ()		;
		    driver.get("https://www.ebay.com/");
		    driver.manage().window().maximize();
	}

	@When("^Enter Monitor in search field$")
	public void enter_Monitor_in_search_field() throws Throwable {
	    
	}

}
