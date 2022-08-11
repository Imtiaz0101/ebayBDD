package ebay.BDD.stepDefinitions;

import ebay.BDD.utilities.SetupDriver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeActions {
	
	@Before("@chrome")
	public void beforeChromeScenario(Scenario scen) {

		System.out.println(">> Started Chrome Driver Initialization <<");
		try {
			SetupDriver.setupChromeDriver();
			System.out.println(">> ChromeDriver Initialized!<<");
			System.out.println(scen.getName());

		} catch (Exception e) {
			System.out.println(">> ChromeDriver Initialization Failed!!<<");
		}

	}

}
