package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		
	   // driver.findElement(By.name("Submit")).click(); 	
		
		String title = driver.getTitle();
		System.out.println(title);
	
		String act_title = driver.getTitle();
		String exp_title = "OrangeHRM";
		
		if (act_title.equals(exp_title))
			
		{
			System.out.println("Test Passed");
		}
			
		else 
			
		{
			System.out.println("Test Failed");
		}
		
		
		driver.close();
		driver.quit();
		
	}

}
