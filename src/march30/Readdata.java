package march30;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readdata {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://shopping.rediff.com/");

		Thread.sleep(5000);

		File f = new File("D:/reddif.txt");

		//File f = new File("D:/primus.doc");

		FileWriter fw = new FileWriter(f);

		BufferedWriter bw = new BufferedWriter(fw);

		String para1 =driver.findElement(By.xpath("((//div[@class='dv_seocont'])[1]]")).getText();

		//String para2 = driver.findElement(By.xpath("//p[position()=2]")).getText();

		bw.write(para1);

		bw.newLine();

		//bw.newLine();

		//bw.write(para2);

		bw.flush();

		bw.close();

		driver.quit();

	}

}
