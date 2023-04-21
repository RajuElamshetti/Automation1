package mar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new FirefoxDriver();
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
