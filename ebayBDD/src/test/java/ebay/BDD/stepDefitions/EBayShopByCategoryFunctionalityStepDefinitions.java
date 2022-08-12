package ebay.BDD.stepDefitions;

import ebay.BDD.Actions.ShopByCategory_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EBayShopByCategoryFunctionalityStepDefinitions {
	ShopByCategory_Actions obj = new ShopByCategory_Actions();
	
	@Given("User is on page ebay home page")
	public void user_is_on_page_ebay_home_page() throws InterruptedException {
	   
	         
	    obj. getebay_home_page();
	    Thread.sleep(1000);
	}
	

	@When("User clicks on Shop By Category")
	public void user_clicks_on_Shop_By_Category() throws InterruptedException {
	   
	   
		obj. clickShopByCategory();   
		Thread.sleep(1000);
	}

	@When("chooses Clothing and Accessories")
	public void chooses_Clothing_and_Accessories() throws InterruptedException {
	   
		 obj. clickclothingAndAccessoriesButton(); 
		 Thread.sleep(1000);
	}



	@When("clicks on Men's Clothing")
	public void clicks_on_Men_s_Clothing() throws InterruptedException {
	   
		obj. clickmensClothing();
		Thread.sleep(1000);
	}

	@When("clicks on Men's Shirts")
	public void clicks_on_Men_s_Shirts() throws InterruptedException {
	   
		obj. clickshirts();
		Thread.sleep(1000);
	}

	@Then("ist should have products of {string}")
	public void ist_should_have_products_of(String string) throws InterruptedException {
	   
	    obj.getmensShirtPage();
	    Thread.sleep(1000);
	}


}
