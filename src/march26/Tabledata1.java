package march26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabledata1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.id("customers"));
		List<WebElement> rowscoll = webtable.findElements(By.tagName("tr"));
		int rows =rowscoll.size()-1;
		System.out.println("No of rows are::"+rows);
		for(int i=1;i<=rows;i++)

		{
			List<WebElement> cols =rowscoll.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				String celldata =cols.get(j).getText();
				System.out.print(celldata+"\n");
				Thread.sleep(500);
			}
			System.out.println("======================================");
			System.out.println();
		}
		driver.quit();
	}


}


