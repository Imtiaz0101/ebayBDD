package ebay.BDD.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import ebay.BDD.Elements.AddItemCard_Elements;
import ebay.BDD.utilities.SetupDriver;

public class AddItemCart_action {
	AddItemCard_Elements element;
	public AddItemCart_action () {
		element = new AddItemCard_Elements();
		PageFactory.initElements(SetupDriver.driver, element);
	}
	public void getebayhomepage() {

        SetupDriver.driver.get("https://www.ebay.com/");

        SetupDriver.driver.manage().window().maximize();

        SetupDriver.driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);

	

	}
	public void gotosearch() {
		element.search.click();
	}
	public void gotosearchbotton() {
		element.searchbotton.click();
	}
	public void gotojavabook() {
		element.javabook.click();
		
		
	}
	public void gotoviewaddcart() {
		element.viewaddcart.click();
		
	}
	public void gotocart() {
		element.cart.click();
	}
	
}
	
	
