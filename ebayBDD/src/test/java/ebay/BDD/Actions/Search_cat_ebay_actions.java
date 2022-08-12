package ebay.BDD.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import ebay.BDD.Elements.Registration_Elements;
import ebay.BDD.Elements.SearchCategories_Elements;
import ebay.BDD.utilities.SetupDriver;
import ebay.BDD.utilities.Helper;

public class Search_cat_ebay_actions {
	
	SearchCategories_Elements elements;
	
	public Search_cat_ebay_actions() {
		this.elements = new SearchCategories_Elements();
		PageFactory.initElements(SetupDriver.driver,this.elements);
	}
	public void getebayhomepage() {
		SetupDriver.driver.get("https://www.ebay.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		SetupDriver.driver.manage().deleteAllCookies();
		System.out.println("chrome opened for searching item ==>");
	}
	public void searchItem(){
		elements.searchBar.clear();
		elements.searchBar.sendKeys("toys ");
		//element.serviceerror.click();
	}
	public void clickSearch(){
		elements.searchBar.sendKeys(Keys.ENTER);    
		//element.serviceerror.click();
	}
	public void getTitle(){
		Helper.getPageTitle();
	}
}