package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeP1 {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver ();
	driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://jqueryui.com/resizable/");
    driver.manage().window().maximize();

    driver.switchTo().frame(0);
    WebElement element = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
	
    Actions act = new Actions(driver);
    act.moveToElement(element).dragAndDropBy(element, 400,100).build().perform();
    
		

	}

}
