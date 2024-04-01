package stepdefnitions;

import java.time.Duration;

import baseTest.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;
import pageFactory.LoginPageFactory;

public class PageFactoryLoginStepsDefinition  {	
	

	
	LoginPageFactory lp;
	HomePageFactory hp;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		
		System.out.println("thread id :-"+ Thread.currentThread().threadId());
			
		DriverFactory.getDriver().get("https://www.saucedemo.com/");
		
		//https://www.saucedemo.com/v1/
		//https://www.saucedemo.com/
		
		System.out.println("user is already on login page");
		
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		System.out.println("title of login page is Free CRM");
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String arg1, String arg2) throws InterruptedException  {
		lp = new LoginPageFactory(DriverFactory.getDriver());
		lp.enterUserName(arg1);
		Thread.sleep(Duration.ofSeconds(1));
		lp.enterPassword(arg2);
		Thread.sleep(Duration.ofSeconds(2));
			
		System.out.println("user enters " + arg1 + "  "+arg2 );  
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException  {
		
		lp.clickLoginButton();
		Thread.sleep(Duration.ofSeconds(1));
		
		System.out.println("user_clicks_on_login_button ");
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
	   
//		int i =driver.findElements(By.xpath("//*[@class='app_logo']")).size();	
//		
//		Assert.assertTrue(i>0);
		
		lp.isAppLogoDisplayed();
		hp = new HomePageFactory(DriverFactory.getDriver());
		hp.shoppingcarIsDisplayed();
		
		
		System.out.println("user is on home page ");
	}

	
	@Then("user moves to new contact page")
	public void user_moves_to_new_contact_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user moves to new contact page ");
	}
	@Then("^user add backback page$")
	public void user_add_backback_page()  {
		hp.addToCartBackpack();
		 
		
	}
	
	//  
	
	@Then("verify product added in the cart")
	public void verify_product_added_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
		
		hp.clickCart();
		hp.checkCartQuantity();
	}
	
	@Then("^user enters contact details \"(.*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String arg1, String arg2, String arg3)  {
	  
		System.out.println("user enters " + arg1 + "  "+arg2 + "  "+ arg3 );
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		
		//driver.quit();
		System.out.println("Close the browser ");
	    
	}



}
