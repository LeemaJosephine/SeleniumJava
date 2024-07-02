package day27;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//h4[text()='United States'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		// Explicit wait
		
		// Step 1: Set the time duration
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Step 2: Condition to wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Your list is currently empty']")));
		
		// Step 3: Perform your action
		String text = driver.findElement(By.xpath("//h3[text()='Your list is currently empty']")).getText();
		
		System.out.println(text);
		
		// Fluent wait
		
		// Step 1: Set the time duration
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(100));
		
		// Step 2: Condition to wait
		
		//wait1.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

}
