package stepdefnitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import baseTest.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookstags  {
	//private DriverFactory driverFactory;
	private WebDriver driver;
	@Before
	public void launchBrowser() {

		//driverFactory = new DriverFactory(); 
		driver =DriverFactory.init_driver("chrome");

		System.out.println("public void launchBrowser()");

	}

	@After
	public void AfterScenario(Scenario sc)
	{
		System.out.println("AfterScenario method executed..");
		if(sc.isFailed()==false)
		{
			sc.log(sc.getName() + "is failed");
			
			//Convert web driver object to TakeScreenshot

			String fileWithPath =  System.getProperty("user.dir")+"\\Screenshot\\failedScreenshot.png";
			TakesScreenshot scrShot =((TakesScreenshot)driver);

			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

			//Move image file to new destination
			File DestFile=new File(fileWithPath);
			
			byte[] SrcFile1=scrShot.getScreenshotAs(OutputType.BYTES);

			//attach image file
			sc.attach(SrcFile1,  "image/png", sc.getName());	

			//Copy file at destination

			try {
				FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		driver.quit();
	}


	@AfterStep
	public void afterStepmethod(Scenario sc)
	{
		System.out.println("afterStepmethod executed..");

		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);

		//Call getScreenshotAs method to create image file
		byte[] SrcFile=scrShot.getScreenshotAs(OutputType.BYTES);

		//attach image file
		sc.attach(SrcFile,  "image/png", sc.getName());	
		
		
	}

}
