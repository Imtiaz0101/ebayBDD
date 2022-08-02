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

import ebay.BDD.Elements.Registration_Elements;
import ebay.BDD.utilities.SetupDriver;



public class Reg_ebay_actions {

	Registration_Elements elements;

	public Reg_ebay_actions() {
		this.elements = new Registration_Elements();
		PageFactory.initElements(SetupDriver.driver,this.elements);

	}

	public void getebay_signup_page() {
		SetupDriver.driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	}

	public void firstname() {
		System.out.println("entering any name");
		elements.FirstName.sendKeys("AA");
	}

	public void lastname() {
		System.out.println("entering anything for lastname");
		elements.lastname.sendKeys("BB");
	}

	public void Email() {
		System.out.println("entering a valid but used email address");
		elements.email.sendKeys("AABB@gmail.com");
	}

	public void Password() {
		
		System.out.println("entering a password");
		elements.password.sendKeys("123456");
	}

	
	public void Signup() {
		System.out.println("click the create account button");
		elements.signup.click();
	}

	public boolean getErrorMessage() {
		boolean bool=false;
		String error= elements.error.getText();
		if (error.contains("This email address is used")|| error.contains("We're sorry")) {
			bool=true;
		}
		return bool;
		
		
	}

	
}
