package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DBPractice1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://api.jquery.com/dblclick/");
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
		
		Actions act = new Actions (driver);
		act.doubleClick().build().perform();
        Thread.sleep(3000);
        
        act.doubleClick().build().perform();
        Thread.sleep(3000);  

        act.doubleClick().build().perform();
        Thread.sleep(3000);
        

		

	}

}
