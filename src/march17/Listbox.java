package march17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create new accou")).click();
		Thread.sleep(5000);
		//store three lists box into select class
		Select daylist = new Select(driver.findElement(By.name("birthday_day")));
		Select monthlit = new Select(driver.findElement(By.name("birthday_month")));
		Select yearlist = new Select(driver.findElement(By.name("birthday_year")));
		daylist.selectByVisibleText("25");
		Thread.sleep(2000);
		driver.close();
	}

}
