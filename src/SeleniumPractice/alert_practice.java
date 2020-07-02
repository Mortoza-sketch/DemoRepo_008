package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_practice {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
	    String title = driver.getTitle();
        System.out.println("The title of the Webpage is: " +title);
       
        String url = driver.getCurrentUrl();
        System.out.println("The URL of the page is: " +url); 
        
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
        Thread.sleep(3000);
        
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        
        alert.accept();
        
        alert.dismiss();   // It's giving error in Java console. Need to solve.     
        
	}

}
