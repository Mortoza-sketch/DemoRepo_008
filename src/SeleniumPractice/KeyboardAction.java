package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/key_presses");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    Actions act = new Actions (driver);
    act.sendKeys(Keys.ENTER).build().perform();
    Thread.sleep(3000);
	
    act.sendKeys(Keys.DELETE).build().perform();
    Thread.sleep(3000);

    act.sendKeys(Keys.SPACE).build().perform();
    Thread.sleep(3000);

    act.sendKeys(Keys.ESCAPE).build().perform();
    Thread.sleep(3000); 
   
    
    
    
	}

}
