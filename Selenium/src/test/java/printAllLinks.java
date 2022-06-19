import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printAllLinks {
	public static String browser="chrome";
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
	
		driver.get("https://www.sugarcrm.com/uk/about/");
		driver.manage().window().maximize();
		
		List<WebElement> alltags=driver.findElements(By.tagName("a"));
		
		for(int i=0; i<alltags.size(); i++) {
		System.out.println(alltags.get(i).getAttribute("href"));	
		}
		}
		
	
}
