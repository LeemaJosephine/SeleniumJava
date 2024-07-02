package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		System.out.println("Before button click : " +driver.getWindowHandle());
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[1]")).click();
		
		// Switch to window
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		// Step 2: Convert Set to List
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		// Step 3: Pick the particular window and switch to it.
		
		driver.switchTo().window(windows.get(1));
		
		// Validation
		
		System.out.println(driver.getTitle());
		
		System.out.println("After button click : " +driver.getWindowHandle());
		
		// Step 4: Close or Quit
		
		driver.close();
		
	}

}
