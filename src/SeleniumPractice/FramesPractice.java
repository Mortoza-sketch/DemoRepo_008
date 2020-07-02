package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); /* when we use this command, we have to use it only once and it's gonna 
                                                                        // work every single time */
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");  // Type in Google Seleniumhq.github.io and looks for suggestions
		
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
				
		System.out.println(links.size());
	
	    driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click();
		
	    

	}

}
