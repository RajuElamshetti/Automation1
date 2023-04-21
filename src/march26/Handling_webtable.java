package march26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_webtable {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//print specific row cell data
		String a =driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[8]/td[1]")).getText();

		String b =driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[8]/td[2]")).getText();

		System.out.println(a+"   "+b);

		driver.quit();

	}

}
