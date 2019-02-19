package java_0219;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileTurnDowm {
	public static void main(String[] args) throws IOException {
		 BufferedReader br =  new BufferedReader(new FileReader("woshi.txt"));
		 ArrayList<String> list = new ArrayList<>();
		 String line;
		 while((line = br.readLine()) != null) {
			 list.add(line);
		 }
		 br.close();
		 BufferedWriter bw = new BufferedWriter(new FileWriter("shiwo.txt"));
		 
		 for(int i = list.size()-1;i >=0;i--) {
			 bw.write(list.get(i));
			 bw.newLine();
			 System.out.println(list.get(i));
		 }
	}
}
