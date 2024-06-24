package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		//Step 2: Load the url
		
		driver.get("https://www.google.com/");	
		
		//Step 3: Maximize the Browser
		
		driver.manage().window().maximize();
		
		// Get the title , validate and print in the console
		
		String expectedTitle="Google";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			
			System.out.println("Page loaded successfully");
		} else {
		
		System.out.println("Unsuccessful");
		}
		
		// Get the page url 
		
		String pageURL = driver.getCurrentUrl();
		System.out.println("The page URL is: " + pageURL);
		
		// Get the page source
		
		String pageSource = driver.getPageSource();
		System.out.println("The page source is: " + pageSource);
		
		
		// Step 4: To close the browser
		
		//driver.close();
		
	}

}
