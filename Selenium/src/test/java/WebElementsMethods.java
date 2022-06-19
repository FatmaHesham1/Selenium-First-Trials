import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsMethods {
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
	
		driver.get("https://www.browserstack.com/users/sign_up?ref=guide-post-locators-in-selenium-free-trial");
		WebElement username= driver.findElement(By.id("user_full_name"));
		username.sendKeys("Fatma");
		
		username.clear();
		
	//	WebElement button=driver.findElement(By.partialLinkText("Sign in"));
		//button.click();
		
		System.out.println(driver.findElement(By.xpath("/html/body/main/div[4]/section/form/div[1]/div/div[1]/div[10]/div/input")).getAttribute("type"));
		System.out.println(driver.findElement(By.id("user_submit")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.id("user_submit")).getSize());
		System.out.println(driver.findElement(By.id("user_submit")).getLocation());
		System.out.println(driver.findElement(By.id("user_submit")).getTagName());
		System.out.println(driver.findElement(By.id("user_full_name")).getText());
		System.out.println(driver.findElement(By.id("user_submit")).isDisplayed());
		System.out.println(driver.findElement(By.id("user_submit")).isEnabled());
		System.out.println(driver.findElement(By.id("user_submit")).isSelected());
		
		

		



		
		
}
}