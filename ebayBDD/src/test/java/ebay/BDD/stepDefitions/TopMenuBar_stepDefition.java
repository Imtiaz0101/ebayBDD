package ebay.BDD.stepDefitions;

import ebay.BDD.Actions.TopMenuBar_action;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TopMenuBar_stepDefition {
	
	TopMenuBar_action action = new TopMenuBar_action();
	
	
	@Given("User is on eBay home page")
	public void user_is_on_eBay_home_page() {
		action.getebayhomepage();
	}
	
	
	

	@When("User click on electronics")
	public void user_click_on_electronics() {
		action.gotoelectronicpage();
	}
		
	
	
	  

	@When("User clicks on cell phones,smart watches & accessories")
	public void user_clicks_on_cell_phones_smart_watches_accessories() {
	action.cellphonedropdown();
	  
	}

	@When("User clicks on cell phone & smartphone")
	public void user_clicks_on_cell_phone_smartphone() {
		action.smartphonepage();
	}
	
	
	   

	@When("User click on Apple")
	public void user_click_on_Apple() {
	
	   action.applepage();

	}

	@Then("User successfully see Apple related items.")
	public void user_successfully_see_Apple_related_items() {
	
	   
	}

	}



