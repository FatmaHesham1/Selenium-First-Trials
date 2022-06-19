import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import static org.openqa.selenium.support.locators.RelativeLocator.*;



import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static String browser="chromme";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
		}
		else {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
	
		driver.get("https://www.saucedemo.com");
		
	WebElement password=driver.findElement(By.id("password"));
	
  
driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("standard_user");
	//WebElement user =(WebElement) RelativeLocator.with(By.tagName("input")).above(password);	
	//user.sendKeys("Testing");
	
	


	}
}
