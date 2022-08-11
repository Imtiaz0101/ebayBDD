package ebay.BDD.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import ebay.BDD.Elements.EbayAddToCartElements;
import ebay.BDD.Elements.EbayRegistration_Elements;
import ebay.BDD.utilities.SetupDriver;

public class ebayAddToCartAction {
	
	
	EbayAddToCartElements elements;
	
	public ebayAddToCartAction() {
		
		elements=new EbayAddToCartElements();
		PageFactory.initElements(SetupDriver.driver, elements);
		
		
	}
	
	public void getHomePage() {
		SetupDriver.driver.get("https://www.ebay.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	
	}	
		
	public void writeInSearchBox() {
		elements.searchBox.clear();
		elements.searchBox.sendKeys("Java Book");
		
		
	}
	
	public void clickSearchBtn() {
		
		elements.btn_search.click();
		
	}
		public void clickBookLink() {
			
			elements.book_link.click();
				
		
		}
		 public void btnAddToCart() {
			 
			 elements.btn_addToCart.click();
			 
		 }
		
		public void goToCart() {
			elements.btn_goToCart.click();
			
			
		}
	
	}


