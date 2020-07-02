package DoubleClickPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DB3 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();

        driver.switchTo().frame(0);
        
        WebElement ele = driver.findElement(By.xpath("//html//body//div"));
        
        Actions act = new Actions(driver);
        act.doubleClick(ele).build().perform();
        Thread.sleep(3000);
        
        act.doubleClick(ele).build().perform();
        Thread.sleep(3000);
        
        
		
	   		
		
		

	}

}
