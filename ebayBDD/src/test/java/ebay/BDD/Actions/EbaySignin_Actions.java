//package ebay.BDD.Actions;
//
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.support.PageFactory;
//import ebay.BDD.Elements.EbaySignin_Elements;
//import ebay.BDD.utilities.SetupDriver;
//
//public class EbaySignin_Actions {
//
//	EbaySignin_Elements elements;
//
//	public EbaySignin_Actions() {
//
//		elements = new EbaySignin_Elements();
//		PageFactory.initElements(SetupDriver.driver, elements);
//
//	}
//
//	public void getEbayHomePageSignin() {
//		SetupDriver.driver.get("https://www.ebay.com/");
//		SetupDriver.driver.manage().window().maximize();
//		SetupDriver.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//
//	}
//
//	public void clickSignin() {
//		System.out.println("User click ebay sign in button");
//
//	    elements.Signin.click();
//	
//	}
//
//	public void enterEmailAddress() {
//		elements.EmailAddress.clear();
//		elements.EmailAddress.sendKeys("sifat0101@gmail.com");
//
//	}
//	public void clickContinue() {
//		
//		elements.btn_Continue.click();
//		
//		
//		
//	}
//	public void enterPassword() {
//		elements.password.clear();
//		elements.password.sendKeys("Im123456@2");
//			
//		}
//	
//	    
//	
//	public void btnClickSignin() throws InterruptedException {
//		
//		elements.btn_signin.click();
//		Thread.sleep(3000);
//	}
//	public void clickSignOut() {
//		
//		elements.btn_signin.click();
//		
//		
//		
//	}
//	
//	public String getErrorMessage() {
//		String errorMsg = elements.errorMsg.getText();
//		return errorMsg;
//		
//		
//	
//		
//		
//		
//	}
//
//}
