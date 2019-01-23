package java_0123;

public class SringSplit {
	public static void main(String[] args) {
		String str1 = "hello,hello,hello";
		String[] array = str1.split(",");
		System.out.println(array.length);
		for(int i = 0;i < array.length; i ++) {
			System.out.println(array[i]);
		}
	}
}
