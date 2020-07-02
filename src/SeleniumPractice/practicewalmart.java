package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class practicewalmart {

	public static void main(String[] args) {
		
		
		
	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.walmart.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	if (title.equals("Walmart.com | Save Money. Live Better."))
		
	{
		System.out.println("The Title is correct");
	}
		
	else
		
	{
		System.out.println("The Title is not correct");
	} 
	
	/*switch (title= "Walmart.com | Save Money. Live Better." )
	
	{
	
	
	case title: System.out.println("The Title is Correct");break;
	default: System.out.println("The Title is not correct");
		
	} */
	

	}

}
