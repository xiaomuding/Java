package java_0108;

import java.util.Scanner;


public class MethodMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the first one");
		int a = sc.nextInt();
		System.out.println("please input the second one");
		int b = sc.nextInt();
		int max = IntMax(a,b);
		System.out.println("the max is " + max);
	} 
	public static int IntMax(int x, int y) {
		if (x>y) {
			return x;
		}else {
			return y;
		}
	}
}
