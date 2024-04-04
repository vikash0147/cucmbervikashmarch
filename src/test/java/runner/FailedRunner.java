package runner;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(tags = "", features = "@target/failedRerunSceanrio.txt", glue = { "stepdefnitions" },

plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target1/failedRerunSceanrio.txt"
		}, 
monochrome = true, dryRun = false, publish = true)

//file:src/test/resources/features/Background.feature:18:32

public class FailedRunner extends AbstractTestNGCucumberTests   {
	
	private TestNGCucumberRunner testNGCucumberRunner;


	@BeforeClass(alwaysRun = true) 
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass()); }

	@SuppressWarnings("unused")

	@Test(groups = "cucumber", description = "Runs cucumber Features",	dataProvider = "scenarios") 
	public void runScenario(PickleWrapper			pickleWrapper ,  FeatureWrapper featureWrapper) {
		//testNGCucumberRunner.runCucumber(cucumberFeature);
		//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		testNGCucumberRunner.runScenario(pickleWrapper.getPickle()); }

	@DataProvider (parallel = true)
	public Object[][] scenarios() { 
		return	  super.scenarios(); 
		//return testNGCucumberRunner.provideScenarios();

	}
	 

	@AfterClass(alwaysRun = true) public void testDownClass() {
		testNGCucumberRunner.finish(); }






}
