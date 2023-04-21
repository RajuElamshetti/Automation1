package march18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
 //verify listbox in multiselection
		boolean value =  dropdown.isMultiple();
		System.out.println(value);
		//select 0to7 items
		for (int i = 0; i<= 7; i++) {
			Thread.sleep(5000);
			dropdown.selectByIndex(i);
		}
		//deselect for listbox
		for (int j = 0; j <=7; j++) {
			Thread.sleep(5000);
			dropdown.deselectByIndex(j);
		}
		Thread.sleep(5000);
		driver.close();
			
		}
			
			
		
			
		}

