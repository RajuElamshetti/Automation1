package march18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownprint {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		for (int i = 0; i <5; i++) {
			dropdown.selectByIndex(i);
		}
		//get collection of items which are selected in listbox
		List<WebElement>selected_items = dropdown.getAllSelectedOptions();
		System.out.println("no of items selected::"+selected_items.size());
		for (WebElement each : selected_items) {
			Thread.sleep(1000);
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.close();
	}

}
