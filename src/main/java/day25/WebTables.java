package day25;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/report/stock-nse-bulk-deals/119/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Column count
		
		List<WebElement> columnCount = driver.findElements(By.xpath("(//table)[2]//th"));
		System.out.println("The column count is " + columnCount.size());
		
		// row count
		
		List<WebElement> rowCount = driver.findElements(By.xpath("(//table)[2]//tr"));
		System.out.println("The row count is " + rowCount.size());
		
		int size = rowCount.size();
		

		List<WebElement> rowData = driver.findElements(By.xpath("(//table)[2]//tr[2]//td"));
		
//		System.out.println("The size of rwodata: "+rowData.size());
//		for(int i =0; i < rowData.size();i++ ) {
//			
//			System.out.println(rowData.get(i).getText());
//		}
//		
		
//		List<WebElement> securityNames = driver.findElements(By.xpath("(//table)[2]//tr//td[1]"));
//		
//		for(WebElement names : securityNames) {
//			
//			String name = names.getText();
//			System.out.println(name);
//		}
//		
		// To Sort and remove the duplicates
		
		Set<String> sort = new TreeSet<String>();
		
		for(int i =1; i<=10;i++) {
			
			String text = driver.findElement(By.xpath("(//table)[2]//tr["+i+"]//td")).getText();
			sort.add(text);
		}
		
		for(String txt : sort) {
			System.out.println(txt);
		}
	}

}
