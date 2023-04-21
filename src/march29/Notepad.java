package march29;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Notepad {

	public static void main(String[] args) throws Throwable {
		File f = new File("D://sample text");
		FileWriter a = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(a);
		b.write("iam learning testing");
		b.newLine();
		b.write("iam in srnagar");
		b.flush();
		b.close();
		
		
		
	}

}
