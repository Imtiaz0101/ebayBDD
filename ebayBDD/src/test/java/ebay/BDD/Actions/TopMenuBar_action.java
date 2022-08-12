package ebay.BDD.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import ebay.BDD.Elements.TopMenuBar_Elements;
import ebay.BDD.utilities.SetupDriver;

public class TopMenuBar_action {
	TopMenuBar_Elements element;
	public TopMenuBar_action() {
		element = new TopMenuBar_Elements();
		PageFactory.initElements(SetupDriver.driver, element);
		
	}
	public void getebayhomepage() {

        SetupDriver.driver.get("https://www.ebay.com/");

        SetupDriver.driver.manage().window().maximize();

        SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

    }
public void gotoelectronicpage() {
	element.electronic.click();
	
}
public void cellphonedropdown() {
	element.cellphone.click();
}
public void smartphonepage() {
	element.smartphone.click();
	
}
public void applepage() {
	element.apple.click();
}

}
