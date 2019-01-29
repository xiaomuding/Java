package java_0129;

import java.io.FileWriter;
import java.io.IOException;

public class DomoWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("1.txt",true);
		fw.write("1253\r\n");
		fw.write(65);
		fw.write("\r\n");
		fw.write("lixianqiansdf", 3, 8);
		char[] array = {'a','s','d','d','d'};
		fw.write(array,2,1);
		fw.close();
	}
}
