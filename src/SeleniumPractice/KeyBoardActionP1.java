package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionP1 {

	public static void main(String[] args) throws InterruptedException {

		
	System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/key_presses");
	driver.manage().deleteAllCookies();
    driver.manage().window().maximize(); 
     
    
    driver.findElement(By.xpath("//input[@id='target']")).sendKeys("1234");
    Thread.sleep(3000);
    Actions act = new Actions (driver);
    act.sendKeys(Keys.DELETE).build().perform();
    Thread.sleep(3000);
    
    act.sendKeys(Keys.SPACE).build().perform();
    Thread.sleep(3000);
    
    act.sendKeys(Keys.ESCAPE).build().perform();
    Thread.sleep(3000);
    
    act.sendKeys(Keys.CONTROL).build().perform();
    Thread.sleep(3000);
    
    
	}

}
