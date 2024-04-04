package baseTest;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReportTestNG extends DriverFactory implements ITestListener {

	public   ExtentSparkReporter SparkReporter ;
	public   ExtentReports extent;
	public   ExtentTest test;

	@Override
	public void onStart(ITestContext context) {

		SparkReporter = new ExtentSparkReporter( System.getProperty("user.dir") + "\\reports\\test.html");
		SparkReporter.config().setDocumentTitle("VikashTest");
		SparkReporter.config().setReportName("VIkash");		
		SparkReporter.config().setTheme(Theme.DARK);
		//SparkReporter.config().setTimeStampFormat("HHMMSSDDMONYYYY");
		
		extent = new ExtentReports();
		
		extent.attachReporter(SparkReporter);

	}


	@Override
	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getTestClass().getRealClass().getSimpleName());
		test.assignCategory(result.getTestClass().getRealClass().getSimpleName());
		//test.createNode(result.getName());
		
		System.out.println(result.getMethod().getMethodName()); ////return @test method name
		System.out.println(result.getName()); ////return @test method name
		
		System.out.println(result.getTestClass().getRealClass().getSimpleName());  //////return class name
		  
			
		//test = extent.createTest(result.getName());	
		
//		System.out.println("extent.createTest(result.getName())  " +  extent.createTest(result.getName()));
//
//		System.out.println("extent.createTest(result.getMethod().getMethodName())  " +  extent.createTest(result.getMethod().getMethodName()) );
//		System.out.println("extent.createTest(result.getMethod().getMethodName())  " +  result.getClass() );
//		System.out.println("extent.createTest(result.getMethod().getMethodName())  " +  result.getTestClass().getRealClass() );
//		System.out.println("extent.createTest(result.getMethod().getMethodName())  " +  result.getClass().getName() );

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//test.assignCategory(result.getMethod().getGroups());
		//test.createNode(result.getName()); ////this will display methods triggered with status inside class hierarchy.
		//test.
		
		// TODO Auto-generated method stub
		
		//test.assignCategory(result.getTestClass().getRealClass().getSimpleName());
		
		//test.createNode(result.getName());
		
		test.log(Status.PASS, result.getMethod().getMethodName()) ;
		test.log(Status.PASS ,   " test vikash");
		test.addScreenCaptureFromPath("D:\\SCAN VIKASH DOC\\Wipro\\Vikash_Photo.jpg");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.FAIL, result.getMethod().getMethodName());
		
		test.log(Status.FAIL,result.getThrowable().getMessage());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}


	@Override
	public void onFinish(ITestContext context) {


		extent.flush();
		// TODO Auto-generated method stub

	}

}
