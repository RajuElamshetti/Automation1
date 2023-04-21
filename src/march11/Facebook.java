package march11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);
		//launch url
		driver.findElement(By.name("email")).sendKeys("rajuelamshetti15@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("raju1511");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
