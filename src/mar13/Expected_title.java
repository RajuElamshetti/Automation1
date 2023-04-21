package mar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expected_title {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String Expected_Title = "google";
		String Actual_Title = driver.getTitle();
		if(Expected_Title.equalsIgnoreCase(Actual_Title))
		{
			System.out.println("title is matching::"+Expected_Title+Actual_Title);
		}
		else 
		{
			System.out.println("title is not matching::"+Expected_Title+Actual_Title);
		}
		driver.close();

	}

}
