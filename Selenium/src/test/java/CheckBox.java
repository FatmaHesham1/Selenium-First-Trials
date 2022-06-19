import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
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
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div[1]/div[1]/div/div[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div[1]/div[3]/div/div[1]")).click();
		
		
		WebElement stp=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/a/img"));
		Actions actions=new Actions(driver);
		
		actions.moveToElement(stp);
		actions.perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div[2]/div[4]/div/div[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div[2]/div[4]/div/div[1]")).click();

		
				
			
			
		
	}}