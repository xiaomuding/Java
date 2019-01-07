
import java.util.Scanner;


public class MaxOfTwo {

	public static void main( String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the first number");
		int a = sc.nextInt();
		System.out.println("please inout the second number");
		int b = sc.nextInt();
		
		if (a >b) {
			System.out.println("max is " + a);
		}else {
			System.out.println("max is " + b);
		}sc.close();
	}
}
