package CumumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions",
monochrome = true, tags = "@PlaceOrder or @OffersPage",
plugin = {"html:target/cumumber.html","json:target/cumumber.json"})
//generetae report like html,xml,junit,extend, json
public class TestNGRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	

}
