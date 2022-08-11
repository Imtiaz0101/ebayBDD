package ebay.BDD.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import ebay.BDD.Elements.Ebay_Sign_Elements;
import ebay.BDD.utilities.SetupDriver;

public class EbaySigninAction {

	Ebay_Sign_Elements element;

	public EbaySigninAction() {
		element = new Ebay_Sign_Elements();

		PageFactory.initElements(SetupDriver.driver, element);

	}

	public void getEbayHomePage() {
		SetupDriver.driver.get("https://www.ebay.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	}

	public void clickSign() {

		element.Signin.click();

	}

	public void email() throws InterruptedException {
		element.EmailAddress.clear();
		element.EmailAddress.sendKeys("sifat0101@gmail.com");

		// Thread.sleep(3000);
	}

	public void clickContinue() {

		element.btn_Continue.click();

	}

	public void enterPassword() {
		element.password.clear();
		element.password.sendKeys("Im123456@2");

	}

	public void btnClickSignin() throws InterruptedException {

		element.btn_signin.click();
		Thread.sleep(3000);
	}

	public void clickSignOut() {

		element.btn_signin.click();

	}

	public void dropdown() {
		element.btn_dropdown.click();

	}

	public void signout() throws InterruptedException {

		element.Click_signout.click();

		Thread.sleep(3000);

	}

	public void browserClose() {

	}

}
