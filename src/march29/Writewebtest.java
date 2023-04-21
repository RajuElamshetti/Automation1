package march29;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Writewebtest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/primus.text");
		Thread.sleep(5000);
		File f = new File("http://primusbank.qedgetech.com/");
		FileWriter fw = new FileWriter(f);

		BufferedWriter bw = new BufferedWriter(fw);

		String para1 =driver.findElement(By.xpath("(//p[position()=1])[2]")).getText();

		String para2 = driver.findElement(By.xpath("//p[position()=2]")).getText();

		bw.write(para1);

		bw.newLine();

		bw.newLine();

		bw.write(para2);

		bw.flush();

		bw.close();

		driver.quit();



		}


	}


