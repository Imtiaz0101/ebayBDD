package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayAddToCartElements {

	@FindBy(xpath="//input[@id='gh-ac']")
	public WebElement searchBox; 
	
	@FindBy(xpath="//input[@id='gh-btn']")
	public WebElement btn_search;
	
	@FindBy(linkText="Effective Java by Joshua Bloch")

	public WebElement book_link;
	
	@FindBy(xpath="//input[@id='gh-btn']")
	public WebElement btn_addToCart;
	
	@FindBy(xpath="//body/div[@id='vi_oly_atcRedesignId_overlay-atc-container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/a[2]")
	public WebElement btn_goToCart;
	

}
