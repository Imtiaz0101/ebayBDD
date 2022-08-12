package ebay.BDD.stepDefinitions;

import org.testng.Assert;

import ebay.BDD.Actions.SigninDataDrivenAction;
import io.cucumber.java.en.*;

public class SigninDataDrivenStepDef {
	
	SigninDataDrivenAction action =new SigninDataDrivenAction();
	
	
	 @Given("^user is on ebay sign in page$")
	    public void user_is_on_ebay_sign_in_page()  {
		 
		 action.getEbayHomePage();
	        
	    }

	 @When("^user input invalid  email address (.*)$")
	    public void user_input_invalid_email_address(String email)  {
	        action.invalidEmail(email);
	    }
	    @And("^user click continue $")
	    public void user_click_continue()  {
	    	action.contineBtn();
	        
	    }
	    
	    @And("^user input invalid password (.*)$")
	    public void user_input_invalid_password(String password) {
	    	action.enterPassword(password);
	    	
	    	
	    }
	    @And("^user click sign in button$")
	    public void user_click_sign_in_button() throws InterruptedException  {
	    	action.btnClickSignin();
	    	
	    }

	    @Then("^user see error messege (.*)$")
	    public void user_see_error_messege_wser(String expectedErrorMsg) throws InterruptedException  {
	    	String actualErrorMsg = action.getErrorMessege();
			Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	    	
	        Thread.sleep(5000);
	    }

	   

}
