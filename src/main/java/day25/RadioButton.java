package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement ele : radio) {
			
			String res = ele.getAttribute("id");
			
			if(res.equalsIgnoreCase("impressiveRadio")) {
				
				Actions act = new Actions(driver);
				act.click(ele).perform();
				
				if(ele.isSelected()) {
					System.out.println("Value selected");
				}
			}
		}
	}

}
