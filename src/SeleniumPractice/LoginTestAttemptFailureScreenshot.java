package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestAttemptFailureScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException  {
     
        System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("1234");
		driver.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
        
        FileUtils.copyFile(src, new File ("C:/Users/tamji/eclipse-workspace/SeleniumTheGreat(Practice)/src/SeleniumPractice/OrangeHRM1.png"));
        Thread.sleep(3000);
        
	    driver.close();
        driver.quit();
		

	}

}
