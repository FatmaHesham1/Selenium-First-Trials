import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenu2 {
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
	
		driver.get("https://getbootstrap.com/docs/5.0/forms/select/");
		WebElement menu=driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[7]/select"));
		
		Select select=new Select(menu);
		System.out.println(select.getFirstSelectedOption().getText());
		
				
				select.selectByIndex(2);
				Thread.sleep(2000);
				
				select.selectByValue("3");
				Thread.sleep(2000);
				
				
				List<WebElement> all=select.getAllSelectedOptions();
				System.out.println(all.size());
				
				Thread.sleep(2000);
				select.deselectAll();
				
				
				select.selectByIndex(2);
				Thread.sleep(2000);
				
				select.selectByValue("3");
				Thread.sleep(2000);
				 
				
				select.deselectByIndex(2);
				List<WebElement> all1=select.getAllSelectedOptions();
				System.out.println(all1.size());
				
				
				
					
				
			
			
		
	}
}
