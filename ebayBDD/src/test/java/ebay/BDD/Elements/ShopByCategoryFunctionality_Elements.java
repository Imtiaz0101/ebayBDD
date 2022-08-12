package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopByCategoryFunctionality_Elements {
	
	@FindBy(xpath = "//*[@id=\"gh-shop-a\"]")
	public WebElement shopByCategoryButton;
	

	@FindBy(xpath = "//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/ul[2]/li[2]/a")
	public WebElement clothingAndAccessoriesButton;

	@FindBy(xpath = "//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/ul[2]/li[2]/a]")
	public WebElement men;

	@FindBy(xpath = "//*[@id=\"s0-16-12-0-1[0]-0-0\"]/ul/li[3]/a")
	public WebElement mensClothing;

	@FindBy(xpath = "//*[@id=\"s0-16-12-0-1[0]-0-0\"]/ul/li[7]/a")
	public WebElement shirts;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/h1/span")
	public WebElement mensShirtPage;
}
