package March16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://google.com");
		Thread.sleep(5000);
		System.out.println("page[1]"+driver.getTitle());
		driver.findElement(By.partialLinkText("Gmail")).click();
		System.out.println("page[2]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("page[3]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("page[4]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();

	}

}
