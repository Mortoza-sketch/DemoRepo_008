package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingAmazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/"); 
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shirt");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
        Thread.sleep(3000);
        
       // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[4]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[3]/h2[1]")).click();
       // Thread.sleep(3000);
        
        
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File ("C:/Users/tamji/eclipse-workspace/SeleniumTheGreat(Practice)/src/SeleniumPractice/AmazonSearch.png"));
        
        driver.close();
        driver.quit();
        
        
	}

}
