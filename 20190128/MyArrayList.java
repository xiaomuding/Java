package java_0128;

import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[] args) {
		ArrayList<Person> person = new ArrayList<>();
		person.add(new Person(15,"loli"));
		person.add(new Person(16,"ppp"));
		System.out.println(person.get(1).getName());
		
	}
}
