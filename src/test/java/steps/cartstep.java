package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.excel.*;

public class cartstep {
	main main =new main();
	WebDriver driver = new EdgeDriver();

	@Given("I am on swiggy website")
	public void i_am_on_swiggy_website() {
		main.home(driver);
		System.out.println("I am on swiggy_website");
	}
	@When("I click cart option and delete items from the cart")
	public void i_click_cart_option_and_delete_items_from_the_cart() {
		System.out.println("i can click cart option and delete from cart");
		main.home(driver);
		main.loc(driver);
		main.search(driver);
		main.addtocart(driver);
		main.update(driver);
	}
	@Then("I able to delete the  items from cart")
	public void i_able_to_delete_the_items_from_cart() {
		System.out.println("I can delete from cart");
	}
	@Given("I am on of swiggy website")
	public void i_am_on_of_swiggy_website() {
		main.home(driver);
		System.out.println("I am on swiggy_website");		
	}
	@When("I click cart option and update items from the cart")
	public void i_click_cart_option_and_update_items_from_the_cart() {
		System.out.println("I can update cart");
		main.home(driver);
		main.loc(driver);
		main.search(driver);
		main.addtocart(driver);
		main.update(driver);
	}
	@Then("I able to update the  items from cart")
	public void i_able_to_update_the_items_from_cart() {
		System.out.println("I can update from cart");  
	}
}
