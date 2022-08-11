package ebay.BDD.stepDefinitions;

import ebay.BDD.Actions.ebayAddToCartAction;
import io.cucumber.java.en.*;

public class EbayAddToCart {
	ebayAddToCartAction action = new ebayAddToCartAction();

	@Given("^user is on ebay search area$")
    public void user_is_on_ebay_search_area()  {
		
		action.getHomePage();
    }

		 
	    


	@And("^user  write iteam name in search box$")
	public void user_write_iteam_name_in_search_box() {
		
		action.writeInSearchBox();

	}

	@When("^user see the iteam$")
	public void user_see_the_iteam() {
           action.clickSearchBtn();	}

	@And("^user click the iteam$")
	public void user_click_the_iteam() {
		action.clickBookLink();
	}

//	@And("^user click add to cart button$")
//	public void user_click_add_to_cart_button() {
//		action.btnAddToCart();
//	}
//
//	@And("^user click go to cart button$")
//	public void user_click_go_to_cart_button() {
//            action.goToCart();
//	}

	
}
