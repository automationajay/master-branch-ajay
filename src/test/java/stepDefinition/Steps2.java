package stepDefinition;

import org.openqa.selenium.By;

import com.launch.DriverInitiator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps2 {
	
	@Given("^Navigate to google and enter hello in search box$")
	public void navigate_to_google_and_enter_hello_in_search_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DriverInitiator.driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("hello");
		System.out.println("Im in Steps2 class @given");
		
	}

	@When("^I entered a hello in search box$")
	public void i_entered_a_hello_in_search_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DriverInitiator.driver.findElement(By.xpath("//button[@value='Search']")).click();
		System.out.println("Im in Steps2 class @when");
	}

	@Then("^user should be able to see the corresponding links$")
	public void user_should_be_able_to_see_the_corresponding_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DriverInitiator.driver.findElement(By.xpath("(//a[contains(text(),'Adele - Hello')])[1]")).click();
		System.out.println("Im in Steps2 class @then");
	}
}
