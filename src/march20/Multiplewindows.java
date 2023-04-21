package march20;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com");
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		Set<String>all_wins = driver.getWindowHandles();
		System.out.println(all_wins);
		for (String a : all_wins) {
			if (!parent.equals(a)) {
				String b = driver.switchTo().window(a).getTitle();
				Thread.sleep(5000);
				System.out.println(b);
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("raju@123");
		Thread.sleep(5000);
		driver.quit();



	}

}




