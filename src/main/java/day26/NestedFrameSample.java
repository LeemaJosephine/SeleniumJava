package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.partialLinkText("Iframe with in an Iframe")).click();
		
		// Switch to parent frame
		
		driver.switchTo().frame(2);
		
		// Switch to child frame
		
		driver.switchTo().frame(0);
		
		// Access the text box
		
		driver.findElement(By.tagName("input")).sendKeys("Sample text");
		
		// To switch from child to parent 
		driver.switchTo().parentFrame();
		
		String parentFrameText = driver.findElement(By.tagName("h5")).getText();
		
		System.out.println("Text from parent frame: "+parentFrameText);
		
		//To come out of the frame and access the element in default area
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.partialLinkText("Single Iframe")).click();
	}

}
