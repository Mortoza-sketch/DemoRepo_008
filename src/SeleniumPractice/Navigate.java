package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	/*	driver.close();
        driver.quit();  */
		
	}

}
