import java.util.Scanner;


public class MaxOfThree {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("first ");
		int a = sc.nextInt();
		System.out.println("second:");
		int b = sc.nextInt();
		System.out.println("third :");
		int c = sc.nextInt();
		
		int temp;
		if (a > b) {
			temp = a;
		}else {
			temp = b;
		}
		int max;
		if (c > temp) {
			max = c;
		}else {
			max = temp;
		}
		System.out.println("the max is " + max);
		
	}
}




