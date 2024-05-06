package cucmbervikashmarch;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/testng-listeners");
		


		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//*[contains(@href, 'http')]
		List<WebElement> links = driver.findElements(By.xpath("//*[contains(@href, 'http')]"));
		
		
	
		
		for(int i=0; i<links.size(); i++){
			String url = links.get(i).getAttribute("href");
			if(url == null || url.isEmpty()){
				System.out.println("url is not valid");
			}

			try{
				
				URL link = new URL(url);
				HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();
				httpConn.connect();

				if(httpConn.getResponseCode() == 200) {
					System.out.println("url link is not broken"+ url+httpConn.getResponseMessage());
				}

				if(httpConn.getResponseCode() ==404) {
					System.out.println("url link is broken"+url +httpConn.getResponseMessage());
				}

			}catch(Exception e){
				e.printStackTrace();
				System.out.println("url link is broken"+url);
			}
		}

	}
}
