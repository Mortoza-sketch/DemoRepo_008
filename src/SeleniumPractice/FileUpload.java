package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
	
		
System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); /* when we use this command, we have to use it only once and it's gonna 
                                                                        // work every single time */
		
		driver.get("https://html.com/input-type-file/");  // Type in Google Seleniumhq.github.io and looks for suggestions
		
		driver.manage().window().maximize();
		
    /* List <WebElement> links = driver.findElements(By.tagName("a"));
     System.out.println(links.size()); 
     
     
	for (WebElement e:links)	
		
	{
		System.out.println(e.getText());
	} */
		
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:/Users/tamji/OneDrive/Desktop/HTML Testing/htmldemo1");
		driver.findElement(By.xpath("//input[2]")).click();

	}

}
