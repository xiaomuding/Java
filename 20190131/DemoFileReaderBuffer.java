package java_0131;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReaderBuffer {
	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("file456.txt");
		char[] buf = new char[5];
		int len;
		while((len = fr1.read(buf)) != -1) {
			//len = fr1.read(buf);
			//System.out.println("len ===" + len);
			String str = new String(buf,0,len);
			System.out.print(str);
		}

		
	} 
}
