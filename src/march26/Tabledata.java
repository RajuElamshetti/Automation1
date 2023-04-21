package march26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabledata {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webTable = driver.findElement(By.className("dataTable"));
		List<WebElement> rowcoll =webTable.findElements(By.tagName("tr"));
		int rows=rowcoll.size()-1;
		System.out.println("No of rows are::"+rows);
		Thread.sleep(5000);
		for (WebElement eachrow : rowcoll) {
			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
			//iterate all cells 
			for (WebElement eachcell : cols) {
				Thread.sleep(500);
				String celldata =eachcell.getText();
				System.out.print(celldata+"\n");
			}
			System.out.println();
			System.out.println("==============================");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}


