package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// switch to frame
		
		driver.switchTo().frame(0);
		
		// locate src element
		
		WebElement src = driver.findElement(By.id("draggable"));
		
		System.out.println("Location before moving: " +src.getLocation());
		
		Actions mouse = new Actions(driver);
		mouse.dragAndDropBy(src, 150, 150).perform();
		
		System.out.println("Location after moving: " +src.getLocation());
	}

}
