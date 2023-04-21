package March16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_hyperlinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com/");
		Thread.sleep(0);
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		System.out.println("no of links are::"+all_links.size());
		//Thread.sleep(5000);
		for(WebElement each:all_links)
		{
			Thread.sleep(0);
			System.out.println(each.getText());
			System.out.println(each.getAttribute(""));

		}
		driver.close();


	}

}
