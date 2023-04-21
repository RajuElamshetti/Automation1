package march11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

class Firefox {

	public static void main(String[] args) throws Throwable {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		//click to register
		driver.findElement(By.name("name")).sendKeys("");
		driver.findElement(By.name("contact")).sendKeys("");
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("gender")).sendKeys("");
		driver.findElement(By.name("dob")).click();
		driver.findElement(By.linkText("10")).click();
		driver.findElement(By.id("flexCheckChecked")).click();
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driver.quit();
	}
		

}
