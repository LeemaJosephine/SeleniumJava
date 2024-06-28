package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// ID Locator
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);
				
		// Link Text
	//	driver.findElement(By.linkText("Amazon miniTV")).click();
		
		// partial lik tex	t
		driver.findElement(By.partialLinkText("Amazon")).click();
		
	}

}
