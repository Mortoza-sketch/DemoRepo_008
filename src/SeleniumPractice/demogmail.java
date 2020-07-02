package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class demogmail {

	public static void main(String[] args) {
		

		
      System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");		
      
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.ebay.com/");
      
      
      String title = driver.getTitle();
      System.out.println(title);  
	
      //System.out.println(driver.getCurrentUrl());
      //System.out.println(driver.getPageSource());
      
      
      if (title.equals("Electronics, Cars, Fashion, Collectibles & More | eBay"))
    	  
      {
    	  System.out.println("The title is correct");
      }
      
      else
    	  
      {
    	  System.out.println("The title is not correct");
      }
		
      driver.close ();
      driver.quit();
      
      
	}

}
