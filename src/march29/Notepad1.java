package march29;

import java.io.*;

public class Notepad1 {

	public static void main(String[] args) throws Throwable {
		FileReader a = new FileReader("D://sample text");
		BufferedReader b = new BufferedReader(a);
		String x = "";
		while ((x=b.readLine())!=null) {
		Thread.sleep(5000);
		System.out.println(x);
		}
		
	}

}
