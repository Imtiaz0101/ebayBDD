package ebay.BDD.stepDefitions;

import ebay.BDD.Actions.AddItemCart_action;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddItemCart_stepDefition {
	AddItemCart_action action = new AddItemCart_action();

@Given("User is on ebay page")
public void user_is_on_ebay_page() {
	action.getebayhomepage();
   
  
}

@When("User search Java book inside search botton")
public void user_search_Java_book_inside_search_botton() {
	action.gotosearch();
   
  
}

@When("User click on search")
public void user_click_on_search() {
	action.gotosearchbotton();
   
  
}

@When("User click on  java book")
public void user_click_on_java_book() {
	action.gotojavabook();
   
  
}

@When("User click on view and add a cart")
public void user_click_on_view_and_add_a_cart() {
	action.gotoviewaddcart();
   
  
}

@Then("User should be able to see the add item in the  cart")
public void user_should_be_able_to_see_the_add_item_in_the_cart() {
	action.gotocart();
   
  
}



}
