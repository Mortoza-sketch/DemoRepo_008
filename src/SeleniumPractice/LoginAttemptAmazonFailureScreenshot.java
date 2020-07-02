package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAttemptAmazonFailureScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/"); 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abcd@gmail.com");	
		driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        Thread.sleep(3000);
        
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File ("C:/Users/tamji/eclipse-workspace/SeleniumTheGreat(Practice)/src/SeleniumPractice/AmazongScreenshot.png"));
  

	}

}
