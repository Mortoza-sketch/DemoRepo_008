package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

/*  1) Open Web Browser
    2) Open URL, https://www.google.com/ 
    3)  
 */



    public class demo1 {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver ();
    
     //driver.get("https://www.google.com/");   
     driver.get("https://footstepsatheart.com/");

     
    String title = driver.getTitle();
    System.out.println(title);
    
   if (title.equals("Footsteps At Heart"))
	   
   {
	   System.out.println("This is correct");
   }
    
   else
	   
   {
	   System.out.println("This is not correct");
   }
    
     //System.out.println(driver.getCurrentUrl());
     //System.out.println(driver.getPageSource());
     
      driver.close();  // for closing single tab
      driver.quit();   // for closing multiple tab
          
   
	}

    }