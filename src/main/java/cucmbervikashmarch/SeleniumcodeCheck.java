package cucmbervikashmarch;

	
	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class SeleniumcodeCheck {
		
		
		 public static WebElement expWait(WebDriver d, By locator) {
			WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			

			
			return element;
			
		}
	    public static void main(String[] args) {
	        // Set the path to the chromedriver executable
	       

	       
	        
	        ChromeOptions opt = new ChromeOptions();
	        opt.addArguments("--disable-notifications");
	        
	        
	        // Create a new instance of the Chrome driver
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver(opt);
	       
	        
	        // Navigate to a website
	        driver.get("https://www.google.com");
	        

	        // Find the hamburger menu button by its class name
	        //WebElement menuButton = driver.findElement(By.className("header__menu-button"));
	        
	      //button[contains(  text() , 'signed')]
	        
	        System.out.println(driver.findElements(By.tagName("iframe")).size());
	       // driver.switchTo().fr
	        
	        
	        driver.switchTo().frame("callout");
	        
	       driver.findElement(By.xpath("//button[contains(text(), 'signed')]")).click();
	       
driver.switchTo().defaultContent();

//*[@aria-label ='Gmail (opens a new tab)']

driver.findElement(By.xpath("//*[@aria-label ='Gmail (opens a new tab)']")).click();

  WebElement ele = expWait(driver, By.id("exampleId"));
  

 

//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("exampleId")));

// Now you can interact with the element
		  ele.click();
	        
	        //WebElement menuButton = driver.findElement(By.xpath("//button[@aria-label='More options']"));

	        // Click on the hamburger menu button
	      //  menuButton.click();

	        // Close the browser
	        //driver.quit();
	    }
	}



