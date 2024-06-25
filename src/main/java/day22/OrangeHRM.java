package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		// 	Load the URL
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Maximize the window
			
		driver.manage().window().maximize();
		
		// implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Test Login Functionality
		
		// Enter the Username
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		// Enter the password
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		// Click login button
		
		driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
		
		// Get the user name and print it in the console.
		
		String username = driver.findElement(By.className("oxd-userdropdown-name")).getText();
		
		System.out.println("The user name is: " + username);
		
	}

}
