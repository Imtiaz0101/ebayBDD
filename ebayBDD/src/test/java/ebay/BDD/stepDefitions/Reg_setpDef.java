package ebay.BDD.stepDefitions;

import org.testng.Assert;

import ebay.BDD.Actions.Reg_ebay_actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Reg_setpDef {
	Reg_ebay_actions obj =new Reg_ebay_actions();


@Given("User is on  page ebay registration page")
public void user_is_on_page_ebay_registration_page() {
	
	obj.getebay_signup_page();
	
}
	

@When("the User inputs first name")
public void the_User_inputs_first_name() {
  
  obj.firstname();
}

@When("inserts last name")
public void inserts_last_name() {
  obj.lastname();
}

@When("User inserts an used email address")
public void user_inserts_an_used_email_address() {
   obj.Email();
}

@When("Inserts a password")
public void inserts_a_password() {
  obj.Password();
}

@When("Click on the Create Account button")
public void click_on_the_Create_Account_button() {
   obj.Signup();
}

@Then("User should receive an error message regarding used email")
public void user_should_receive_an_error_message_regarding_used_email() {
	boolean actual = obj.getErrorMessage();
	Assert.assertEquals(actual, true);
 
	}
}

