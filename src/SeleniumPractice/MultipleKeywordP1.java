package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeywordP1 {

	public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");		
    ChromeDriver driver = new ChromeDriver ();
    driver.manage().deleteAllCookies();

    driver.get("http://www.newtours.demoaut.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    Actions act = new Actions (driver);
   // act.sendKeys(Keys.CONTROL+ "a").build().perform();
    
   act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();  
   


	}

}
