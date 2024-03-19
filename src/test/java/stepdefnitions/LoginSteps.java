//package stepdefnitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginSteps {
//	
//	static WebDriver driver ;
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() {
//		
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.saucedemo.com/v1/");
//		
//		//https://www.saucedemo.com/v1/
//		
//		System.out.println("user is already on login page");
//		
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//		System.out.println("title of login page is Free CRM");
//	}
//
//	@Then("user enters {string} and {string}")
//	public void user_enters_and(String arg1, String arg2)  {
//		
//	driver.findElement(By.id("user-name")).sendKeys(arg1);
//	driver.findElement(By.id("password")).sendKeys(arg2);
//	
//		
//		System.out.println("user enters " + arg1 + "  "+arg2 );  
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button()  {
//		
//		driver.findElement(By.id("login-button")).click();
//		
//		System.out.println("user_clicks_on_login_button ");
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()  {
//	   
//		int i =driver.findElements(By.xpath("//*[@class='app_logo']")).size();	
//		
//		Assert.assertTrue(i>0);
//		
//		System.out.println("user is on home page ");
//	}
//
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page()  {
//	 
//		System.out.println("user moves to new contact page ");
//	}
//	
//	//  
//	@Then("^user enters contact details \"(.*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_contact_details_and_and(String arg1, String arg2, String arg3)  {
//	  
//		System.out.println("user enters " + arg1 + "  "+arg2 + "  "+ arg3 );
//	}
//
//	@Then("^Close the browser$")
//	public void close_the_browser() {
//		
//		driver.close();
//		System.out.println("Close the browser ");
//	    
//	}
//
//
//
//}
