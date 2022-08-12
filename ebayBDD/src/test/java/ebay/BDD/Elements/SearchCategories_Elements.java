package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchCategories_Elements {
	
	
	@FindBy(xpath = "//*[@id='gh-ac']")
	public WebElement searchBar;
	
	@FindBy(xpath = "<input type=\"submit\" class=\"btn btn-prim gh-spr\" id=\"gh-btn\" value=\"Search\">")
	public WebElement searchButton;

}
