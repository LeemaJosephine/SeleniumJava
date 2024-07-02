package day26;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Simple Alert
		//driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100))
				.withMessage("Increase the polling time");
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
//		// Confirm Alert
//		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
//		
//		Alert alert1 = driver.switchTo().alert();
//		//alert1.dismiss();
//		System.out.println(alert1.getText());
//		alert1.accept();
//		
//		//Prompt alert
//		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
//		
//		Alert alert2 = driver.switchTo().alert();
//		alert2.sendKeys("Sample user");
//		alert2.accept();
//		
//		
		
	}

}
