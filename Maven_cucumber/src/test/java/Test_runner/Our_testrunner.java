package Test_runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resource/vhejal "},
plugin = {"json:target/cucumber.json"},
glue = "Step_defination ")//tags = {"@Sanity"})

public class Our_testrunner extends  AbstractTestNGCucumberTests   {

}
