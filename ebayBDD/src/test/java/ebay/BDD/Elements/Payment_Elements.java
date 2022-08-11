package ebay.BDD.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment_Elements {
	
	
	@FindBy(xpath ="//*[@id=\"isCartBtn_btn\"]")
	public WebElement addToCart;
	
	@FindBy(xpath = "//*[@id=\"ADDON_0\"]/div/div[2]/div/div[4]/div/button[1]")
	public WebElement protectionPlan;
	
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[4]/div/div[1]/button")
	public WebElement gotoCheckout;
	
	@FindBy(xpath = "//*[@id=\"gxo-btn\"]")
	public WebElement guest;
	
	@FindBy(xpath = "//*[@id=\"firstName\"]")
	public WebElement shippingFirstName;
	
	@FindBy(xpath = "//*[@id=\"lastName\"]")
	public WebElement shippingLastName;
	
	@FindBy(xpath = "//*[@id=\"addressLine1\"]")
	public WebElement shippingAddress;
	
	@FindBy(xpath = "//*[@id=\"city\"]")
	public WebElement shippingCity;
	
	@FindBy(xpath = "//*[@id=\"stateOrProvince\"]")
	public WebElement shippingState;
	
	@FindBy(xpath = "//*[@id=\"postalCode\"]")
	public WebElement shippingZipCode;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement shippingEmail;
	
	@FindBy(xpath = "//*[@id=\"emailConfirm\"]")
	public WebElement shippingEmailConfirm;
	
	@FindBy(xpath = "//*[@id=\"phoneNumber\"]")
	public WebElement shippingPhoneNumber;
	
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div[3]/div/div[1]/section[2]/div[3]/div/div/div/div[2]/div[1]/form/div/div/div/button")
	public WebElement shippingDone;
	
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div[3]/div/div[1]/section[2]/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[2]/button")
	public WebElement shippingSuggestion;
	
	@FindBy(xpath = "(//input[@ class='radio__control'])[2]")
	public WebElement addnewcard;

	@FindBy(xpath = "(//input[@id='cardNumber'])")
	public WebElement cardnumber;
	
	@FindBy(xpath = "//*[@id=\"credit-card-details\"]/div[2]/div/div[1]/button")
	public WebElement donebutton;
	
	@FindBy(xpath = "//*[@id=\"cardNumber-error\"]")
	public WebElement errormsg;
	
	
	
}
