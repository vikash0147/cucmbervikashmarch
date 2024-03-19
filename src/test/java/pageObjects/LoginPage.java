package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By txt_username = By.id("user-name");
	By txt_password  = By.id("password");
	By login_button = By.id("login-button");
	By home_logo = By.xpath("//*[@class='app_logo']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}

	public void enterUserName( String  username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword( String  password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLoginButton() {
		driver.findElement(login_button).click();
	}

	public void userLogin( String username , String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(login_button).click();
		
	}
	public void  isAppLogoDisplayed() {
		 driver.findElement(home_logo).isDisplayed();
		
	}
	


}
