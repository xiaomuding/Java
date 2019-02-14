package java_0214;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file987.txt");
		
		BufferedReader br = new BufferedReader(fr);
		String line;
/*		String line = br.readLine();
		System.out.println(line);
		
		String line1 = br.readLine();
		System.out.println(line1);
*/		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
