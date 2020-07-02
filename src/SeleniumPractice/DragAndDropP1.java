package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropP1 {

	public static void main(String[] args) throws InterruptedException {
	
		
    System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");		
    ChromeDriver driver = new ChromeDriver();
    driver.manage().deleteAllCookies();

    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    WebElement source_element = driver.findElement(By.id("box3"));
    WebElement target_element = driver.findElement(By.id("box103"));
    
    Actions act = new Actions(driver);
    act.dragAndDrop(source_element, target_element).build().perform();
    Thread.sleep(3000);
    
    WebElement source_element1 = driver.findElement(By.id("box7"));
    WebElement target_element1 = driver.findElement(By.id("box107"));
    act.dragAndDrop(source_element1, target_element1).build().perform();
    Thread.sleep(3000);
	 	
    driver.close();
    driver.quit();

    
	}

}
