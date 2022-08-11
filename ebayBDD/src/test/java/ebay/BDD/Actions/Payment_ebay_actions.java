package ebay.BDD.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ebay.BDD.Elements.Payment_Elements;
import ebay.BDD.utilities.SetupDriver;

public class Payment_ebay_actions extends SetupDriver {
	
	Payment_Elements elements;
	public Payment_ebay_actions() {
		elements = new Payment_Elements();
		PageFactory.initElements(SetupDriver.driver, elements);
	}
	public void getebaycontrollerpage() {
		SetupDriver.driver.get("https://www.ebay.com/itm/154686516424?hash=item240408ecc8:g:78YAAOSwCXVhhaCy&amdata=enc%3AAQAHAAAAwJpu%2F9pwviiZh0PpnJ0dhg5%2Bv6EDVZvEmyzuH%2FujMwVNuStzILupITPEdm36ZUwZN7%2BnhQUikHO9VNJhXJTuwiykM6Vg5ImtoFQktgwP9uCvkSBoS5LY6jBmQzXGOvyJieQIvW05G6E1%2F5eGEfU%2F%2FaLctO3WwBQ0WY5Zl8Yss37Iqp3ZxB0WgCvGvuxnZg5m4m07mX0A1leOHPSRLQQCem6zQ8NDJBnHGdif2K8M0wz%2FjnYFCnGnEa%2BzOQ2sHJSMJw%3D%3D%7Ctkp%3ABlBMUPjX6vHPYA");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	public void addToCart() {
		elements.addToCart.click();
	}
	public void protectionPlan() {
		elements.protectionPlan.click();
	}
	public void checkout() {
		elements.gotoCheckout.click();
	}
	public void clickOnGuest() {
		elements.guest.click();
	}
	public void shippingInformation() {
		elements.shippingFirstName.click();
		elements.shippingFirstName.sendKeys("Bob");
		
		elements.shippingLastName.click();
		elements.shippingLastName.sendKeys("Smith");
		
		elements.shippingAddress.click();
		elements.shippingAddress.sendKeys("123 Apple Street");
		
		elements.shippingCity.click();
		elements.shippingCity.sendKeys("Bennet");
		
		elements.shippingState.click();
		elements.shippingState.sendKeys("Nebraska");
		elements.shippingState.sendKeys(Keys.ENTER);
		
		elements.shippingZipCode.click();
		elements.shippingZipCode.sendKeys("68317");
		
		elements.shippingEmail.click();
		elements.shippingEmail.sendKeys("abc123@gmail.com");
		
		elements.shippingEmailConfirm.click();
		elements.shippingEmailConfirm.sendKeys("abc123@gmail.com");
		
		elements.shippingPhoneNumber.click();
		elements.shippingPhoneNumber.sendKeys("123456789");
		
	}
	public void clickDone() {
		elements.shippingDone.click();
	}
	public void acceptShippingSuggestion() {
		elements.shippingSuggestion.click();
	}
	
	public void addNewCard() {
		WebElement addnewcard = driver.findElement(By.xpath("(//input[@class='radio__control'])[2]"));
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(addnewcard));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", addnewcard);

		
	}
	public void cardnumber() {
		WebElement cardnumber = driver.findElement(By.xpath("(//input[@id='cardNumber'])"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", cardnumber);
		executor.executeScript("arguments[\"4444 4444 4444 4444\"].sendKeys();", cardnumber);
		
		
	}
	
	public void clickdoneagain() {
		elements.donebutton.click();
		
	}
	public String geterrormsg() {
		String errormsg = elements.errormsg.getText();
		return errormsg;
		
		
	}
}
