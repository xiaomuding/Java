package java_0218;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToList {
	public static void main(String[] args) throws IOException {
		BufferedReader bw = new BufferedReader(new FileReader("woshi.txt"));
		ArrayList<String> list = new ArrayList<>();
		String line;
		while((line = bw.readLine()) != null) {
			list.add(line);
		}
		bw.close();
		for(int i =0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
		//System.out.println(arg0);
	}
}
