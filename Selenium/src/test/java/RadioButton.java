import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static String browser="chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
	}
	else {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	}

	driver.get("https://www.priceline.com/flights/?refid=CO8196909&refclickid=13246673SID&utm_medium=Affiliate&utm_source=CO8196909&utm_campaign=CJ&utm_content=hp&utm_term=13246673SID&slingshot=1163&vrid=b9be95b4d0858a14bb1f57942198deb9");
	driver.manage().window().maximize();
	
driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div[1]/form/div[1]/div[3]/label")).click();
	
	
	System.out.print(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div[1]/form/div[1]/div[3]/label")).isEnabled());
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div[1]/form/div[1]/div[2]/label")).isSelected());
	
	
}}
	

