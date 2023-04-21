package march_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_link {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//capture google link
		String Expected = driver.findElement(By.linkText("Gmail")).getText();
		String Actual = "gmail";
		if (Expected.equalsIgnoreCase(Actual))
		{
			System.out.println("link is found in a page"+Expected+"    "+Actual);
		}
		else
		{
			System.out.println("link is not found in a page"+Expected+"   "+Actual);	
		}
		driver.close();

	}

}
