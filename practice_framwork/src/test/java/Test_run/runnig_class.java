package Test_run;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {" src/test/resourcess"},
plugin = {"json:target/cucumber.json"},
glue = "steps_defi ")//tags = {"@Sanity"})



public class runnig_class extends AbstractTestNGCucumberTests {

}
