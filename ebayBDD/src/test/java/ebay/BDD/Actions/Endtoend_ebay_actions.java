package ebay.BDD.Actions;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.PageFactory;

import ebay.BDD.Elements.Endtoend_Elements;
import ebay.BDD.Elements.*;
import ebay.BDD.utilities.*;
import ebay.BDD.utilities.*;

public class Endtoend_ebay_actions {
	
	Endtoend_Elements elements;
	public Endtoend_ebay_actions() {
		elements = new Endtoend_Elements();
		PageFactory.initElements(SetupDriver.driver, elements);
		
	}
	public void getebayhomepage() {
		SetupDriver.driver.get("https://www.ebay.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	public void gotoelectronicsPage() {
		elements.electronics.click();
	}
	public void clickApple() {
		elements.apple.click();
	}
	public void clickProduct() {
		elements.product.click();
	}
	
	public void clickAddToCart() {
		elements.addtoCart.click();
	}
	public void clickCart() {
		elements.cart.click();
	}
	public void clickCheckout() {
		elements.checkOut.click();
	}
	public void clickGuest() {
		elements.guest.click();
	}
	public void getTitle() {
		Helper.getPageTitle();
	}
}
