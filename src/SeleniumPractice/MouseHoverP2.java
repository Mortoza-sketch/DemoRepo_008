package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverP2 {

	public static void main(String[] args) throws InterruptedException {
   
	System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
   
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);

    WebElement Admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
    WebElement User_Management =driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
    WebElement System_User = driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
    Thread.sleep(3000);
    
    Actions act = new Actions (driver);
    act.moveToElement(Admin).moveToElement(User_Management).moveToElement(System_User).build().perform();
    Thread.sleep(5000);
    
    
    driver.close();
    driver.quit();
    
	

	}

}
