package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_I_Frame {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        
		WebElement outerframe = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/iframe[1]"));
        driver.switchTo().frame(outerframe);
        
        WebElement innerframe = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/iframe[1]"));
        driver.switchTo().frame(innerframe);
        
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Mortoza Tamjid");
		
	}

}
