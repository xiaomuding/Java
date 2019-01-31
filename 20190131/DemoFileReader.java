package java_0131;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("file123.txt");
		int nu;
		
		while((nu= fr1.read()) != -1) {
					
				System.out.println((char)  nu);			
		}		
		fr1.close();
	}
}
