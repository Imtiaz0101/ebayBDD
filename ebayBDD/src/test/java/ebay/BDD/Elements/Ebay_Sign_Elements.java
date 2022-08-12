package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ebay_Sign_Elements {
	

	@FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-eb-u']/span[@id='gh-ug']/a[1]")
	public WebElement Signin;
	
	@FindBy(xpath = "//input[@id='userid']")
	public WebElement EmailAddress ;
	

	@FindBy(xpath = "//button[@id='signin-continue-btn']")
	public WebElement btn_Continue;
	
	@FindBy(xpath = "//input[@id='pass']")
	public WebElement password;
	@FindBy(xpath = "//button[@id='sgnBt']")
	public WebElement btn_signin;
	
	@FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-eb-u']/button[@id='gh-ug']/b[2]")
	public WebElement btn_dropdown;
	
	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	public WebElement Click_signout;
}
