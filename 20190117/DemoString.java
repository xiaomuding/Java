package java_0117;

public class DemoString {
	public static void main(String[] args) {
		char[] array = {'a','c','f','d'};
		String str1 = new String(array);
		String str2 = new String(array,0,2);
		System.out.println(str1 + "----" +str2);
	}
}
