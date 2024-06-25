package day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAndSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		driver.navigate().to("https://www.google.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
		// Capture all the links avaialble in the page
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i =0; i <links.size();i++) {
			
			System.out.println(links.get(i).getText());
		}
		
		// Find the search box
		//driver.findElement(By.id("APjFqb")).sendKeys("Selenium",Keys.ENTER);
		
//		WebElement search = driver.findElement(By.name("q"));
//		if(search.isDisplayed()) {
//			search.sendKeys("Selenium");
//			search.clear();
//			search.sendKeys("Selenium Webdriver",Keys.ENTER);
//		} else {
//			
//			System.out.println("Element not found");
//		}
		
//		String expectedText="Selenium";
//		String actualText = driver.findElement(By.xpath("(//div[contains(@class ,'PZPZlf')])[2]")).getText();
//		
//		if(expectedText.equalsIgnoreCase(actualText)) {
//			System.out.println("Search is suscess");
//		} else {
//			System.out.println("Search unscucessful");
//		}
		
		
		driver.switchTo().frame("loginIframe");
		
	}

}
