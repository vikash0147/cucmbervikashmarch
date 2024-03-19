package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageFactory {
	WebDriver driver;
	
	@FindBy(id ="shopping_cart_container")
	public WebElement shoppingcart;

	@FindBy(xpath = "//*[contains(text() , 'Backpack')]//following::button[1]")
	public WebElement addToCartBackpack;
	
	@FindBy(xpath = "//*[@class='cart_quantity']")
	public WebElement cart_quantity;
	
	
	
	//Swaglabs
	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void shoppingcarIsDisplayed() {
		shoppingcart.isDisplayed();

	}
	
	public void addToCartBackpack() {
		addToCartBackpack.click();
	}
	
	public void clickCart() {
		shoppingcart.click();
	}
	
	public void checkCartQuantity() {
	
		int a =Integer.parseInt(cart_quantity.getText());
		
		System.out.println("cart_quantity is : " +a);
		Assert.assertTrue(a>=1);
		
	}
}


