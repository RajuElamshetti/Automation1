package march29;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File {

	public static void main(String[] args) throws Throwable {

		FileReader fr= new FileReader("D:\\primus.txt");
		BufferedReader br = new BufferedReader(fr);
		String str ="";
		while((str=br.readLine())!=null){
			String x[]= str.split(";");
			WebDriver dr = new ChromeDriver();
			dr.manage().window().maximize();
			dr.manage().deleteAllCookies();
			//dr.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
			dr.get("http://primusbank.qedgetech.com/");
			Thread.sleep(3000);
			dr.findElement(By.xpath("//input[@id='txtuId']")).sendKeys(x[0]);
			dr.findElement(By.xpath("//input[@id='txtPword']")).sendKeys(x[1]);
			dr.findElement(By.xpath("//input[@id='login']")).click();
			Thread.sleep(3000);
			String exp = "adminflow";
			String act = dr.getCurrentUrl();

			Thread.sleep(3000);
			if(act.contains(exp))
			{
				System.out.println("login sucess   "+exp+"   "+act);
			}
			else {

				System.out.println("login fail   "+exp+"   "+act);
			}
			Thread.sleep(3000);
			dr.quit();
		}


	}


}


