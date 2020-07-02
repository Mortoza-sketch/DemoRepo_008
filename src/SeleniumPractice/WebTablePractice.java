package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	public static void main(String[] args) {
    
		
	System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();

    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    	
    //Login
    
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();

    
    //Admin --> User Management --> User
	
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
    driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']")).click();
    driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
    
    
    //Table
    
    int rows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
    System.out.println(rows);
    
    //count down the number of employees
    
    int count=0;
    for (int r=1; r<=rows; r++)
    	
    {
    	String status = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+r+"]//td[5]")).getText();
    	if (status.equals("Enabled"))
    		
    	{
    		count ++;
    	}
    	
    	
    }
    	
    System.out.println("Number of Enable Employees:" +count);
    System.out.println("Number of Disabled Employees:" +(rows-count)); 
   
    	
   
    
    

	}

}
