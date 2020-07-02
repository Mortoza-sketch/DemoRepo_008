package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingWikipidea {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.wikipedia.org/"); 
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Bangladesh");
		driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Amar Sonar Bangla')]")).click();
		
	}

}
