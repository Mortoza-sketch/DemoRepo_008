package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg_page_Testing_FB_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();       // To maximize the Browser
		
		
		//xpath
		
		
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Salah Ad Din");
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		/*
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Al Ayyubi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("abcd1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Dec");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("25");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='globalContainer']//span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='u_0_13']")).click();

        driver.navigate().to("https://www.facebook.com/");
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdtesting@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd1234"); 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
        Thread.sleep(3000);    */
        
       /* String title = driver.getTitle();
        System.out.println("The title of the Webpage is: " +title);
       
        String url = driver.getCurrentUrl();
        System.out.println("The URL of the page is: " +url); */
		
		//id
		
		/*driver.findElement(By.id("u_0_m")).sendKeys("Umar");
		driver.findElement(By.id("u_0_o")).sendKeys("Radi Allahu Anhu"); */
		
		//CSS selector
		
		//driver.findElement(By.cssSelector("#u_0_m")).sendKeys("Mohammad");
		//driver.findElement(By.cssSelector("#u_0_o")).sendKeys("SAW");
		
		// Class Name: className was not working out for the instructor and same for me. So we are avoiding class name.
		
		//driver.findElement(By.className("placeholder")).sendKeys("Mohammad");
		//driver.findElement(By.className("placeholder")).sendKeys("SAW");
		
		//driver.findElement(By.className("_58mt")).click();
		
        driver.close();		
        driver.quit();
		
		
	}

}
