package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWait {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); /* when we use this command, we have to use it only once and it's gonna 
                                                                         work every single time */
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    
		
		Thread.sleep(3000); /* We have to use this every single time if we want to use it */
		

	}

}
