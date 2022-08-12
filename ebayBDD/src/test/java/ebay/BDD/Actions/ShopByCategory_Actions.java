package ebay.BDD.Actions;

import java.util.concurrent.TimeUnit;

import javax.lang.model.util.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ebay.BDD.Elements.ShopByCategoryFunctionality_Elements;
import ebay.BDD.utilities.SetupDriver;



public class ShopByCategory_Actions {

	ShopByCategoryFunctionality_Elements elements;

	public ShopByCategory_Actions() {
		this.elements = new ShopByCategoryFunctionality_Elements();
		PageFactory.initElements(SetupDriver.driver,this.elements);

	}

	public void getebay_home_page() {
		SetupDriver.driver.get("https://www.ebay.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	}

	public void clickShopByCategory() {
		this.elements.shopByCategoryButton.click();
		
	}

	public void clickclothingAndAccessoriesButton() {
		this.elements.clothingAndAccessoriesButton.click();
	}

	public void clickMen() {
		this.elements.men.click();
	}

	public void clickmensClothing() {
		this.elements.mensClothing.click();
	}

	
	public void clickshirts() {
		this.elements.shirts.click();
	}
	
	

	public String getmensShirtPage() {
		String mensShirtPage = this.elements.mensShirtPage.getText();
		
		return mensShirtPage;
		
		
	}

	
}
