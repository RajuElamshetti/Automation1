package march_15;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		String user = username.getAttribute("value");
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String pass = password.getAttribute("value");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println(user+"  "+password);
		Thread.sleep(5000);
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if (Actual.contains(Expected))
		{
			System.out.println("login success::"+Expected+"  "+Actual);
		}
		else
		{
			//capture error
			String error_message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(error_message+"     "+Expected+"    "+Actual);

		}

		driver.close();	

	}
}





