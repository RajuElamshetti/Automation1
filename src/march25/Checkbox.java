package march25;

import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/checkbox_1.html");
		Thread.sleep(5000);
		//get collection of checkbox
		List<WebElement>All_checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println("no of checkboxes are::"+All_checkboxes.size());
	Thread.sleep(5000);
	for (WebElement a : All_checkboxes) {
	//verify which is true which is false
		boolean value =a.isSelected();
		//capture checkbox name
		String checkboxname = a.getAttribute("value");
		System.out.println(checkboxname+"    "+value);
		Thread.sleep(5000);
		a.click();		
	}
	Thread.sleep(5000);
	driver.quit();
	}

}
