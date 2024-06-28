package day25;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		
//		for(WebElement ele : checkBox) {
//			
//			String result =ele.getAttribute("id");
//			
//			if(result.equals("hobbies-checkbox-2")) {
//				
//				Actions act = new Actions(driver);
//				act.moveToElement(ele).click().perform();
//		
//				if(ele.isSelected()) {
//					System.out.println("Option selected");
//					act.click(ele).perform();
//					System.out.println("Option deselected");
//				}
//			}
//		
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the hobby: ");
//		String hobbies = "Music";
//		
//		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label"));
//		
//		for(WebElement ele : checkBox) {
//			
//			String res = ele.getText();
//			
//			if(res.equalsIgnoreCase(hobbies)) {
//				
//				Actions act = new Actions(driver);
//				act.moveToElement(ele).click().perform();
//				
//				if(ele.isSelected()) {
//					System.out.println("Option selected");
//					act.click(ele).perform();
//					System.out.println("Option deselected");
//				}
//			}
//		}
		
		driver.findElement(By.xpath("(//button[@title='Toggle'])[1]")).click();
		List<WebElement> checks = driver.findElements(By.xpath("//span[@class='rct-checkbox']/following-sibling::span[2]"));
		
		for(WebElement ele1: checks) {
			
			String text = ele1.getText();
			if(text.equalsIgnoreCase("Desktop")) {
				
				Actions act = new Actions(driver);
				act.moveToElement(ele1).click().perform();
				
			}
		}
	}

}
