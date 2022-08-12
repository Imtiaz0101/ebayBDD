package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_Elements {
	
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement FirstName;
	

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//input[@id='Email']")
	public WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;

	@FindBy(id = "//button[@id='EMAIL_REG_FORM_SUBMIT']")
	public WebElement signup;
	
	//Test
}
