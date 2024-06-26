package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Source element for Drag
		WebElement src = driver.findElement(By.partialLinkText("BANK"));
		
		// Destination element fot drop
		
		WebElement dest = driver.findElement(By.id("bank"));
		
		// Perform the action
		
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(src, dest).perform();
		
		WebElement src1 = driver.findElement(By.id("fourth"));
		
		WebElement dest1 = driver.findElement(By.id("amt7"));
		
		mouse.dragAndDrop(src1, dest1).perform();
		
	}

}
