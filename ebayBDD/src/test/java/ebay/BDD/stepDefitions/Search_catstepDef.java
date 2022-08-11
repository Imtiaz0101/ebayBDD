package ebay.BDD.stepDefitions;

import static org.testng.Assert.assertEquals;

import com.github.dockerjava.api.model.Driver;

import ebay.BDD.Actions.Search_cat_ebay_actions;
import ebay.BDD.utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_catstepDef {
	
	Search_cat_ebay_actions action = new Search_cat_ebay_actions();
	
	@Given("User is at eBay homepage")
	public void user_is_at_eBay_homepage() {
	    action.getebayhomepage();
	}

	@When("User types toys into search bar")
	public void user_types_toys_into_search_bar() {
		action.searchItem();
	}
		
	
	    
	@When("User presses search button")
	public void user_presses_search_button() {
	    action.clickSearch();
	}

	@Then("User should only see toys")
	public void user_should_only_see_toys() {
		String actualTitle = Helper.getPageTitle();
		String expectedTitle = "toys: Search Result | eBay";
		assertEquals(expectedTitle,actualTitle);
	}
	    
	

	@Then("User closes browser")
	public void user_closes_browser() {
		
	    
	}
	
	}
