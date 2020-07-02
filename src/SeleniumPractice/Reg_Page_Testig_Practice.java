package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg_Page_Testig_Practice {

	public static void main(String[] args) {
		
 System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("Forgot accoun")).click();

        driver.navigate().back();
        driver.findElement(By.partialLinkText("Terms")).click();
		
	}

}
