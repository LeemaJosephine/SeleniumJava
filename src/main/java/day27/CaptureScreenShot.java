package day27;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Mention the path
		
		File dest1 = new File("C:\\Users\\Digital Suppliers\\eclipse-workspace\\SeleniumJava\\snap\\FlagPage.png");
		
		// Move source to dest
		
		FileUtils.copyFile(source1, dest1);
		
		driver.findElement(By.xpath("(//h4[text()='United States'])[1]")).click();
		
		// Capture screenshot
		
				File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				// Mention the path
				
				File dest = new File("C:\\Users\\Digital Suppliers\\eclipse-workspace\\SeleniumJava\\snap\\HomePage.png");
				
				// Move source to dest
				
				FileUtils.copyFile(source, dest);
	}
}
