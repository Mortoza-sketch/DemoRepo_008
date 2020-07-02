package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg_Page_Testing_For_Facebook {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.partialLinkText("Forgot accoun")).click();
			driver.navigate().to("https://www.facebook.com/");
	        driver.findElement(By.partialLinkText("Terms")).click();
	        driver.navigate().to("https://www.facebook.com/");
	        driver.findElement(By.partialLinkText("Data Poli")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Cookies Poli")).click();
            driver.navigate().to("https://www.facebook.com/");
	        driver.findElement(By.linkText("Create a Page")).click();
	        driver.navigate().to("https://www.facebook.com/");
	        
            

            driver.findElement(By.partialLinkText("Españ")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.linkText("Français (France)")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("中文(简")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("العرب")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.linkText("Português (Brasil)")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Italia")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("한국어")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Deuts")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("हिन्")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("日本語")).click();
            driver.navigate().to("https://www.facebook.com/");
            
            driver.findElement(By.linkText("English (US)")).click();
            driver.navigate().to("https://www.facebook.com/");  
            
            driver.findElement(By.partialLinkText("Sign")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Log")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Messeng")).click();
            driver.navigate().to("https://www.facebook.com/"); 
            driver.findElement(By.partialLinkText("Facebook Li")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Watch")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Peop")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Pages")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Page Categori")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Plac")).click();           
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Games")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Locatio")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Marketpla")).click();
            driver.navigate().to("https://www.facebook.com/");
		    driver.findElement(By.partialLinkText("Grou")).click();
		    driver.navigate().to("https://www.facebook.com/");
		    driver.findElement(By.partialLinkText("Instagr")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Local")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.linkText("Fundraisers")).click();
            driver.navigate().to("https://www.facebook.com/");
		    driver.findElement(By.linkText("Services")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.linkText("About")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.linkText("Create Ad")).click(); 
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Create Pa")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Develope")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Caree")).click();		    
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Priva")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.linkText("Cookies")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Ad Choic")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[26]/a[1]")).click();
            driver.navigate().to("https://www.facebook.com/");
            driver.findElement(By.partialLinkText("Help")).click();
            driver.navigate().to("https://www.facebook.com/");		    
            
		    
		    driver.close();
            driver.quit(); 
		    
		
	}

}
