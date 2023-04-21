package march26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabledata2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		WebElement tname = driver.findElement(By.id("customers"));
		List<WebElement> rowscoll = tname.findElements(By.tagName("tr"));
		//WebElement tname = dr.findElement(By.id("customers"));
		//List<WebElement> rows = tname.findElements(By.id("tr"));
		System.out.println(rowscoll.size());
		for (WebElement cell : rowscoll) {
			List<WebElement> data = cell.findElements(By.tagName("td"));
			//System.out.println(data.size());
			for (WebElement name : data) {
				String na= name.getText();
				//System.out.print(na+"\t");
				System.out.print(na+"\n");
				Thread.sleep(500);
			}
			System.out.println();	
		}

		driver.close();
	}



}


