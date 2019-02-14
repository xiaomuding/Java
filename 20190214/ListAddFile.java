package java_0214;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ListAddFile {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		list.add("sdfds");
		list.add("werewr");
		list.add("xcvcbb");
		//FileWriter fw = new FileWriter("woshi.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("woshi.txt"));
		for(int i = 0;i < list.size();i++) {
			String str = list.get(i);
			bw.write(str);
			bw.newLine();
		}
		bw.close();
		
		
	}
}
