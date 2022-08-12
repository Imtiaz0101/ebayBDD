package ebay.BDD.stepDefinitions;

import ebay.BDD.Actions.EbaySigninAction;
import ebay.BDD.utilities.SetupDriver;
import io.cucumber.java.en.*;

public class EbaySigninStepDefi {
	
	EbaySigninAction obj = new EbaySigninAction();
	
	@Given("user now on ebay home page")
	public void user_now_on_ebay_home_page() {
		
		obj.getEbayHomePage();
		
	    
	}
	@And("user click signin")
	public void user_click_signin() {
	    obj.clickSign();
	}

	 @And("^user input valid email$")
	    public void user_input_valid_email() throws InterruptedException  {
		 
		 obj.email();
		 
	    }
	 @And("^user click continue$")
	    public void user_click_continue_button()  {
	        obj.clickContinue();
	    }
	 @And("^user input valid password$")
	    public void user_input_valid_password() throws InterruptedException  {
	        obj.enterPassword();
	        
	    }
	 
	 @And("^user click signin button$")
	    public void user_click_signin_button() throws InterruptedException  {
		 
		 obj.btnClickSignin();
		 
		 
	       
	    }

	  @And("^user click signout drop down button$")
	    public void user_click_signout_drop_down_button()  {
	        obj.dropdown();
	    }

	    @And("^user click sign out$")
	    public void user_click_sign_out() throws InterruptedException  {
	    	
	        obj.signout();
	    }
	    @Then("^user close browser$")
	    public void user_close_browser()  {
	        
	    	SetupDriver.driver.quit();
	    }

}
