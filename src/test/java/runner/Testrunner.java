package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseTest.UploadExtentReport;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(tags = "", features = "src/test/resources/features", glue = { "stepdefnitions" },

plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"rerun:target/failedRerunSceanrio.txt"}, 
monochrome = true, dryRun = false, publish = true)
public class Testrunner extends AbstractTestNGCucumberTests   {


	private TestNGCucumberRunner testNGCucumberRunner;


	@BeforeClass(alwaysRun = true) 
	public void setUpClass() {
		
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass()); 
		 System.out.println("@BeforeClass(alwaysRun = true") ;
	}

	@SuppressWarnings("unused")

	@Test(groups = "cucumber", description = "Runs cucumber Features",	dataProvider = "scenarios") 
	public void runScenario(PickleWrapper			pickleWrapper ,  FeatureWrapper featureWrapper) {
		//testNGCucumberRunner.runCucumber(cucumberFeature);
		//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
		System.out.println("@Test(groups = \"cucumber\", description = \"Runs cucumber Features\",	dataProvider = \"scenarios\")") ;	
	}

	@DataProvider (parallel = true)
	public Object[][] scenarios() { 
		System.out.println("@DataProvider (parallel = true)") ;
		return	  super.scenarios(); 
		//return testNGCucumberRunner.provideScenarios();
		 
	}
	 

	@AfterClass(alwaysRun = true) public void testDownClass() {
		UploadExtentReport.UploadReport();
		 System.out.println("@AfterClass(alwaysRun = true) public void testDownClass()") ;
		testNGCucumberRunner.finish(); }



}
