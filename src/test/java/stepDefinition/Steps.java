package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.launch.DriverInitiator;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@Before
	public void beforeClass(){
		System.out.println("=====Before Steps1=======");
	}
	

	@After
	public void afterClass(){
		System.out.println("=====After Steps1=======");
	}
		
	@Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		System.out.println("Im starting in firefox browser");
		driver.manage().window().maximize()*/;
		System.out.println("Im in Steps class @given");
		
	}

	@When("^I entered valid username and valid password$")
	public void i_entered_valid_username_and_valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		DriverInitiator.driver.findElement(By.id("lst-ib")).sendKeys("hello");
		DriverInitiator.driver.findElement(By.name("btnG")).click();
		System.out.println("Im in Steps class @when");
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		DriverInitiator.driver.findElement(By.linkText("Adele - Hello - YouTube")).click();
		DriverInitiator.driver.navigate().to("http://www.google.com");
		System.out.println("Im in Steps class @Then");
	}
}
