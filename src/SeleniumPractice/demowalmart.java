package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class demowalmart {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.walmart.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getPageSource());

		driver.close();
		driver.quit();
		
	}

}
