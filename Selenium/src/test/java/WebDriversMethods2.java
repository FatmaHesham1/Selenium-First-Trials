import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriversMethods2 {

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
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();

		List<WebElement> list=driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div/div"));
	System.out.println(list);
	
	driver.navigate().to("https://www.lambdatest.com/blog/selenium-4-relative-locator/");
	String window=driver.getWindowHandle();
	System.out.println(window);
	
	driver.findElement(By.partialLinkText("Live")).click();
	Set<String> drivee=driver.getWindowHandles();
	System.out.println(drivee);
	
	


	}

}
