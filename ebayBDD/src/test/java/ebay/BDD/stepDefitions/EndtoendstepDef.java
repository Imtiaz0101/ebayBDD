package ebay.BDD.stepDefitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ebay.BDD.Actions.Endtoend_ebay_actions;
import ebay.BDD.utilities.SetupDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EndtoendstepDef extends SetupDriver {
	Endtoend_ebay_actions action = new Endtoend_ebay_actions();
	
	
	@Given("User is on eBay homepage")
	public void user_is_on_eBay_homepage() {
		action.getebayhomepage();
	    
	    
	}

	@When("User clicks on electronics")
	public void user_clicks_on_electronics() {
	    action.gotoelectronicsPage();
	    
	}

	@When("User clicks on Apple")
	public void user_clicks_on_Apple() {
	    action.clickApple();
	    
	}

	@When("User clicks on Apple product")
	public void user_clicks_on_Apple_product() {
	    action.clickProduct();
	
		
		String mainWindow = driver.getWindowHandle();
		
		
        				
            Set<String> allWindowHandle=driver.getWindowHandles();		
        		
        		
        	for(String currentHandle : allWindowHandle)		
        {		
            
            if(!currentHandle.equalsIgnoreCase(mainWindow))			
            {  
            		
            driver.switchTo().window(currentHandle);
            action.clickAddToCart();
            action.clickCart();
            action.clickCheckout();
            action.clickGuest();
            	
            	}
         }
	}
	@When("User clicks on Add to Bag button")
	public void user_clicks_on_Add_to_Bag_button() {
	    
	    
	}

	@When("User clicks on cart button")
	public void user_clicks_on_cart_button() {
	    
	    
	}

	@When("User clicks on Checkout button")
	public void user_clicks_on_Checkout_button() {
	    
	    
	}

	@When("User clicks on Continue as Guest button")
	public void user_clicks_on_Continue_as_Guest_button() {
		
	    
	    
	}

	@Then("User should be able to checkout their item")
	public void user_should_be_able_to_checkout_their_item() {
	    
	    
	}




}
