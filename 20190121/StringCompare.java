package java_0121;

public class StringCompare {
	public static void main(String[] args) {
		char[] array = {'a','b','c'};
		String str1 = new String(array);
		String str2 = "aBc";
		String str4 = null;
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("null"));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
