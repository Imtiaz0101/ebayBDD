package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuBar_Elements {
	@FindBy(xpath= "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
	public WebElement electronic ;
	
	
	@FindBy(xpath="//*[@id=\"s0-16-12-0-1[0]-0-0-27[1]-0-toggle-button\"]/span")
	public WebElement cellphone;
	
	@FindBy(xpath="//*[@id=\"s0-16-12-0-1[0]-0-0-27[1]-0\"]/ul/li[6]/a")
	public WebElement smartphone;
	
	
	@FindBy(xpath="//*[@id=\"s0-27_1-9-0-1[1]-0-1[0]-0-12-list\"]/li[1]/a/p")
	public WebElement apple;

}
