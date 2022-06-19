import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllSelectOptions {
	public static String browser="chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
		}
		else {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
	
		driver.get("https://www.salesforce.com/form/other/role-based-newsletter/?d=cta-glob-nav-21");
		List<WebElement> menu=driver.findElements(By.tagName("select"));
		
		for(int i=0;i<menu.size();i++) {
			
			System.out.print(menu.get(0).getAttribute("value"));
		}
		}
		
		
}
