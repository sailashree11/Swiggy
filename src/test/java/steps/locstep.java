package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.excel.*;
public class locstep {
	
	
	main main = new main();
	WebDriver driver = new EdgeDriver();

@Given("I am on swiggy homepage website")
public void i_am_on_swiggy_homepage_website() {
	System.out.println("i_am_on_swiggy_homepage_website");
	main.home(driver);
}
@When("I click on Enter your delivery location")
public void i_click_on_enter_your_delivery_location() {
	System.out.println("i click on enter your delivery location");
	main.home(driver);
	main.loc(driver);
	
}
@Then("I press enter to select location")
public void i_press_enter_to_select_location() {
	System.out.println("i press enter to select location");
	main.home(driver);
	main.loc(driver);
}
}
