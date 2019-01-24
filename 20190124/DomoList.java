package java_0124;
import java.util.ArrayList;


//ArrayList
public class DomoList {
	public static void main(String[] args){
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		list1.add("123");
		list1.add("12df");
		boolean su = list1.add("123");
		list1.set(0, "987");
		System.out.println(list1.get(0) + su + list1.size());
	} 
}
