package java_0213;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo_buffer_reader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file987.txt");
		BufferedReader br = new BufferedReader(fr);
/*		int ch;
		while((ch = br.read()) != -1) {
			System.out.print((char)ch);
		}
*/
		char[] buf = new char[2];
		int len;
		while((len = br.read(buf)) != -1) {
			String str = new String(buf,0,len);
			System.out.print(str);
		}
		br.close();
	}
}
