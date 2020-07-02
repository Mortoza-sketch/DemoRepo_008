package Slider_Practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Slider_P3 {
public static void main(String[] args) {

     
	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver ();
	driver.manage().deleteAllCookies();
    driver.manage().window().maximize();

    driver.get("https://jqueryui.com/slider/");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
    
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
    WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
    Actions act = new Actions (driver);
    act.moveToElement(slider).dragAndDropBy(slider, 500, 0).build().perform();    
    System.out.println("Slider Action Performed ....");
    
	
	
	}

}
