import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

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
	
		driver.get("https://www.browserstack.com/guide/locators-in-selenium");
		
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.findElement(By.linkText("Debugging")).click();
	


	}

}
