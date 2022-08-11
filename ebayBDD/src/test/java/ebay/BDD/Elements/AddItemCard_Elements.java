package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddItemCard_Elements {
	@FindBy(xpath = "//input[@id='gh-ac']")
	public WebElement search;
	
	@FindBy(xpath = "//[@id='gh-btn']")
	public WebElement searchbotton;
	
	@FindBy(xpath = "//*[@id=\"vi-img-overlay--trans\"]")
	public WebElement javabook;
	
	@FindBy(xpath = "//a[@id='vi-viewInCartBtn']")
	public WebElement viewaddcart;
	
	@FindBy(xpath = "//i[@id='gh-cart-n']")
	public WebElement cart;
			
	

}
