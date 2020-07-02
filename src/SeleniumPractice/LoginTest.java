package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		//driver.findElement(By.linkText("REGISTER")).click();
		
        
		driver.findElement(By.name("userName")).sendKeys("abcd1234");		
		
	}

}
