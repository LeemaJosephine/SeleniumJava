package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		Actions mouse = new Actions(driver);
//		mouse.moveToElement(men).perform();
//		
//		driver.findElement(By.partialLinkText("Casual Shirts")).click();
		
		WebElement contactUs = driver.findElement(By.xpath(" //a[text()=' Contact Us '] "));
		
		// Scroll Down using Action class
		
//		mouse.moveToElement(contactUs).perform();
//		contactUs.click();
		
		// Scroll down using JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", contactUs);
	}

}
