package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expectedDay="1";
		String expcetedMonth="August 2024";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		while(true) {
			
			String actualMonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
			if(expcetedMonth.equals(actualMonth)) {
				break;
			} else {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		driver.findElement(By.xpath("//p[text()='"+expectedDay+"']")).click();
		
	}

}
