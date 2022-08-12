package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayRegistration_Elements {
	
	@FindBy(xpath = "//a[contains(text(),'register')]")
	public WebElement Registration;
	
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement FirstName;
	

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;

	@FindBy(xpath = "//input[@id='Email']")
	public WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;

	@FindBy(id = "EMAIL_REG_FORM_SUBMIT")
	public WebElement CreateAcount;
	
	
	
	@FindBy(xpath = "//h1[contains(text(),'An account already exists')]")
	public WebElement errorMsg;

}
	
	
	


