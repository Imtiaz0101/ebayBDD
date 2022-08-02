package ebay.BDD.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber-json.json" }, features = {
	"src/test/resources/Features" }, glue = { "macysBDDStepDefinition" }, tags = { "@chrome", }, monochrome = true)



public class EbayBDDRunner extends AbstractTestNGCucumberTests {

}
