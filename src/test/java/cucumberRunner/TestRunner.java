package cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="featuress", glue={"stepDefinition"},
format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	

}


