package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Endtoend_Elements {
	
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
	public WebElement electronics;
	
	@FindBy(xpath = "//*[@id=\"s0-16-12-0-1[3]-0-0-0\"]/ul/li[2]/a")
	public WebElement apple;
	
	@FindBy(xpath = "//*[@id=\"s0-27_1-9-0-1[4]-0-0\"]/ul/li[5]/div/div[2]/a/h3")
	public WebElement product;
	
	@FindBy(xpath = "//*[@id=\"s0-0-18-5-11-26-77-2[1]-atcBtn\"]")
	public WebElement addtoCart;
	
	@FindBy(xpath = "//*[@id=\"gh-cart-n\"]")
	public WebElement cart;
	
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[4]/div/div[1]/button")
	public WebElement checkOut;
	
	@FindBy(xpath = "//*[@id=\"gxo-btn\"]")
	public WebElement guest;

}
