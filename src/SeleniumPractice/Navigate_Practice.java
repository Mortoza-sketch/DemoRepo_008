package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Practice {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.navigate().back();

        driver.navigate().forward();
        Thread.sleep(3000);   
        
        driver.navigate().refresh();
		

	}

}
