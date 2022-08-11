package ebay.BDD.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import ebay.BDD.Elements.SigninDataDrivenElements;
import ebay.BDD.utilities.SetupDriver;

public class SigninDataDrivenAction {

	SigninDataDrivenElements elements;

	public SigninDataDrivenAction() {

		elements = new SigninDataDrivenElements();
		PageFactory.initElements(SetupDriver.driver, elements);

	}

	public void getEbayHomePage() {
		SetupDriver.driver.get("https://www.ebay.com/signin/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	}

	public void invalidEmail(String email) {
		elements.EmailAddress.clear();
		elements.EmailAddress.sendKeys(email);

	}

	public void contineBtn() {
		
		elements.btn_Continue.click();
	}

	public void enterPassword(String password) {
		elements.password.clear();
		elements.password.sendKeys(password);
			
		}
	public void btnClickSignin() throws InterruptedException {

		elements.btn_signin.click();
		Thread.sleep(3000);
	}
	
	
	public String getErrorMessege() {
		String errorMsg = elements.errorMsg.getText();

		return errorMsg;

	}
	 
}