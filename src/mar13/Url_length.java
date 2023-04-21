package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Url_length {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https:/meesho.com");
		Thread.sleep(5000);
		//print script length
		String a = driver.getTitle();
		System.out.println(a);
		System.out.println(a.length());
		//print url length
		String b = driver.getCurrentUrl();
		System.out.println(b.length());
		Thread.sleep(5000);
		driver.close();

	}

}
