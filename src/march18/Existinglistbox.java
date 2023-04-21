package march18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Existinglistbox {

	public static void main(String[] args) throws Throwable {
		String Expected_item = "electronics";
		boolean item_exist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>all_items = listbox.getOptions();
		for (WebElement each : all_items) {
			String Actual_items = each.getText();
			Thread.sleep(3000);
			System.out.println(Actual_items);
			if (Actual_items.equalsIgnoreCase(Expected_item)) {
				item_exist = true;
				break;
			}
		}
		//if item exist is true print item found else not found
		if (item_exist) {
			System.out.println("item is found::"+Expected_item);
		}
		else
		{
			System.out.println("item not found::"+Expected_item);
		}
		Thread.sleep(5000);
		driver.close();

	}
}
