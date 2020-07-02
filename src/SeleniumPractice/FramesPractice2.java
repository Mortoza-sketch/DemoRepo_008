package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice2 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); /* when we use this command, we have to use it only once and it's gonna 
                                                                        // work every single time */
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");  // Type in Google Seleniumhq.github.io and looks for suggestions
		
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
				
		System.out.println(links.size());
	
	    driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		//driver.switchTo().defaultContent();
		
	    driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[contains(text(),'AbstractAnnotations')]")).click();

		
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html");
		//driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//html[1]/body[1]/div[3]/table[1]/tbody[2]/tr[3]/td[1]/a[1]")).click();


	}

}
