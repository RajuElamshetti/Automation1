package march11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flightscode {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		//click on register
		driver.findElement(By.partialLinkText("Register")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("name")).sendKeys("Raju");
		driver.findElement(By.name("contact")).sendKeys("8106866095");
		driver.findElement(By.name("email")).sendKeys("rajuelamshetti@gmail.com");
		driver.findElement(By.name("password")).sendKeys("raju");
		driver.findElement(By.name("gender")).sendKeys("male");
		driver.findElement(By.name("dob")).click();
		driver.findElement(By.linkText("4")).click();
		driver.findElement(By.id("flexCheckChecked")).click();
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driver.quit();

	}
}