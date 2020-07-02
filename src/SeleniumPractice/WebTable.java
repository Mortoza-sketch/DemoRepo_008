package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
        //Login
		
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);

        //Admin --> User Management --> User
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
        driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']")).click();
        driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']")).click();
        Thread.sleep(3000);

        //Table
        
        int rows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
        System.out.println(rows);   
		

	}

}
