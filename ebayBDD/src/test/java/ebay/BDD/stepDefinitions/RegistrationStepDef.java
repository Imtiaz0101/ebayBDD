package ebay.BDD.stepDefinitions;

import ebay.BDD.Actions.EbayRegistration_Action;
import io.cucumber.java.en.*;

public class RegistrationStepDef {
	
	EbayRegistration_Action action = new EbayRegistration_Action();
	
	@Given("user is on ebay home page")
	public void user_is_on_ebay_home_page() {
	   action.getEbayHomePage();
	    
	}

	@When("user click register link")
	public void user_click_register_link() {
	   action.clickRegisterlink();
	    
	}

	@Then("user nevigated to register page")
	public void user_nevigated_to_register_page() {
	   action.nevigateToRegistrationPage();
	    
	}

	@And("user input first name")
	public void user_input_first_name() {
	   action.firstName();
	    
	}

	@And("user input last name")
	public void user_input_last_name() {
	   action.lastName();
	    
	}

	@And("user input used email")
	public void user_input_used_email() {
	   action.usedEmail();
	    
	}

	@And("user create password")
	public void user_create_password() {
	   action.password();
	    
	}

	@Then("user click create button")
	public void user_click_create_button() throws InterruptedException {
	   action.clickCreateAccount();
        
	    
	}

//	@Then("user should get an error messag")
//	public void user_should_get_an_error_messag() {
//	   action.getErrorMessage();
//	    
//	}


	
	
	

}
