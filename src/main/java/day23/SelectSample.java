package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		// To select data from Select Tag
		
		WebElement day = driver.findElement(By.id("day"));
		Select sc = new Select(day);
		sc.selectByIndex(4);
		
		WebElement month = driver.findElement(By.id("month"));
		Select sc1 = new Select(month);
		sc1.selectByValue("3");
		
		
		
	}

}
