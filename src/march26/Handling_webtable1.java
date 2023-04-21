package march26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_webtable1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.className("dataTable"));
		//get collection row intable
		List<WebElement>rows = webtable.findElements(By.tagName("tr"));
		int rowscoll = rows.size();
		System.out.println("no of rows are::"+rowscoll);
		Thread.sleep(5000);
		//iterate all rows
		for (int i = 0; i <=rowscoll; i++) {
			//column collection
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(500);
			System.out.println("row no "+i+"   "+"column size::"+cols.size());


		}

		driver.quit();	

	}

}
