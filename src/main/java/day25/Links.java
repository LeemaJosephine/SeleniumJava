package day25;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println("No.of Links: " +size);
		
		for(WebElement ele: links) {
			
			String link = ele.getAttribute("href");
			String text = ele.getText();
			
			System.out.println(text+" => " +link);
		}
	}

}
