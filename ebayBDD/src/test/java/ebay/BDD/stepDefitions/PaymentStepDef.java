package ebay.BDD.stepDefitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ebay.BDD.Actions.Payment_ebay_actions;
import ebay.BDD.Elements.Payment_Elements;
import ebay.BDD.utilities.SetupDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentStepDef extends SetupDriver  {
	
	Payment_ebay_actions actions = new Payment_ebay_actions();
	@Given("User is on ebay gamecube controller item page")
	public void user_is_on_ebay_gamecube_controller_item_page() {
	    actions.getebaycontrollerpage();
	}
	
	@When("User clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
	    actions.addToCart();
	}

	@When("User clicks on {string} for protection plan")
	public void user_clicks_on_for_protection_plan(String string) {
	   actions.protectionPlan();
	}

	@When("User clicks on checkout now")
	public void user_clicks_on_checkout_now() {
		actions.checkout();
	    
	}




	@When("User clicks on continue as guest")
	public void user_clicks_on_continue_as_guest() {
	    actions.clickOnGuest();
	    
	}

	@When("User enters valid shipping credentials")
	public void user_enters_valid_shipping_credentials() {
	    actions.shippingInformation();
	    
	}

	@When("User clicks on done")
	public void user_clicks_on_done() {
	    actions.clickDone();
	    
	}
	@When("User clicks on the shipping suggestion")
	public void user_clicks_on_the_shipping_suggestion() {
	   actions.acceptShippingSuggestion();
	}
	
	@When("User clicks on Add new card")
	public void user_clicks_on_Add_new_card()  {
		actions.addNewCard();
	}
	@When("User enters invalid card number")
	public void user_enters_invalid_card_number() {
		WebElement cardnumber = driver.findElement(By.xpath("(//input[@id='cardNumber'])"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", cardnumber);
		executor.executeScript("arguments[\"4444 4444 4444 4444\"].sendKeys();", cardnumber);
	}

	@When("user clicks on done again")
	public void user_clicks_on_done_again() {
		actions.clickdoneagain();
	    
	}

	@Then("User will see the message {string}")
	public void user_will_see_the_message(String string) {
		actions.geterrormsg();
	    
	    
	}




}
