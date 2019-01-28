package java_0128;

import java.util.ArrayList;

public class ArrayListWrapper {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(500);
		list.add(500);
		System.out.println(list);
		int num = list.get(1);
		System.out.println(num);
	}
}
