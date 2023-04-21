package march18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlealert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("asrg");
		driver.findElement(By.name("login")).click();
		//capture alert message
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(5000);
//click on alert message
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();
		
	}

}
