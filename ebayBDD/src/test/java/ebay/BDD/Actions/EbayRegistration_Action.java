package ebay.BDD.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import ebay.BDD.Elements.EbayRegistration_Elements;
import ebay.BDD.utilities.*;


public class EbayRegistration_Action {
	
	EbayRegistration_Elements elements;
	
	public EbayRegistration_Action() {
		
		elements=new EbayRegistration_Elements();
		PageFactory.initElements(SetupDriver.driver, elements);
		
		
	}
	
	public void getEbayHomePage() {
		SetupDriver.driver.get("https://www.ebay.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	
	}	

	public void clickRegisterlink() {
		
		System.out.println("user click register link");
		elements.Registration.click();
		
		
	}
	public void nevigateToRegistrationPage() {
		System.out.println("user is on Registration page");
		
		
	}

	public void firstName(){
		System.out.println("User enter first name");
		elements.FirstName.sendKeys("AA");
		
		
	}

	public void lastName(){
		System.out.println("User enter last name");
		elements.Lastname.sendKeys("BB");
		
		
	}
	
	public void usedEmail(){
		System.out.println("User enter used email");
		elements.email.sendKeys("sifat0101@gmail.com");
		
		
	}
	
	
	public void password(){
		System.out.println("User enter password");
		elements.password.sendKeys("im123456789");
		
		
	}
	public void clickCreateAccount() throws InterruptedException {
		
		System.out.println("User click Create Account button");
		elements.CreateAcount.click();
		Thread.sleep(3000);
		
	}
//	public String getErrorMessage() {
//		String errorMsg_01 = elements.errorMsg.getText();
//		return errorMsg_01;
//	
//		}
	
	
	
}
