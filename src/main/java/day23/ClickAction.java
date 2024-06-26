package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Right Click
		WebElement rightClick= driver.findElement(By.xpath("//span[contains(@class,'context-menu-one')]"));
		
		Actions mouse = new Actions(driver);
		//mouse.contextClick(rightClick).perform();
		
		// Double click
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		mouse.doubleClick(doubleClick).perform();
	}

}
