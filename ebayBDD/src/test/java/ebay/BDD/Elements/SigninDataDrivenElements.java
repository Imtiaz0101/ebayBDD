package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninDataDrivenElements {
	
	@FindBy(xpath = "//input[@id='userid']")
	public WebElement EmailAddress ;
	
	
	@FindBy(xpath = "//button[@id='signin-continue-btn']")
	public WebElement btn_Continue;
	
	@FindBy(xpath = "//input[@id='pass']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@id='sgnBt']")
	public WebElement btn_signin;
	@FindBy(xpath = "//p[@id='errormsg']")
	public WebElement errorMsg;
	

}
