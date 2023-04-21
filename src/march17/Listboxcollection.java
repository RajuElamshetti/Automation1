package march17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxcollection {


	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com/");
		Thread.sleep(500);
		//store listbox into select class
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items in a listbox
		List<WebElement>all_items = listbox.getOptions();
		System.out.println("no of items ::"+all_items.size());
		Thread.sleep(3000);		
		for (WebElement each:all_items)
		{
			Thread.sleep(0);
			System.out.println(each.getText());
		}
		Thread.sleep(0);
		driver.close();
	}

}
