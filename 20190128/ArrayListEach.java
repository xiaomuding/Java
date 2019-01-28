package java_0128;

import java.util.ArrayList;

public class ArrayListEach {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); 
		list.add("lucy");
		list.add("lily");
		list.add("john");
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
