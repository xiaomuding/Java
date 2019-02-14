package java_0213;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo_Buffer {
	public static void main(String [] args) throws IOException {
		FileWriter fw = new FileWriter("file987.txt");
		
		BufferedWriter bw = new BufferedWriter(fw); 
		
		bw.write("sdgfdgfdgfd");
		bw.newLine();
		bw.write("sdgfdgfdgfd");
		bw.close();
		
	}
}
