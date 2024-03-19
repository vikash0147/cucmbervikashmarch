package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;


	@FindBy(id ="user-name")
	public WebElement txt_username;

	@FindBy(id ="password")
	public WebElement txt_password;

	@FindBy(id ="login-button")
	public WebElement loginbutton;


	@FindBy(xpath ="//*[@class='app_logo']")
	public WebElement homoLogo;


	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void enterUserName( String  username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword( String  password) {
		txt_password.sendKeys(password);
	}

	public void clickLoginButton() {
		loginbutton.click();
	}

	public void userLogin( String username , String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		loginbutton.click();

	}
	public void  isAppLogoDisplayed() {
		homoLogo.isDisplayed();

	}


}
