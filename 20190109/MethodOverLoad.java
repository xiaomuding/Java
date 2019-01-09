package java_0109;

public class MethodOverLoad {
	public static void main (String[] args) {
		System.out.println(Sum(1,5,6));
	}
	public static int Sum(int a, int b) {
		return a + b;
	}
	public static int Sum(int a, int b,int c) {
		return a+b+c ;
	}
}
