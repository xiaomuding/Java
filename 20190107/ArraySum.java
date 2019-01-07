package java_0107;

public class ArraySum {
	public static void main(String[] args) {
		int [] array = new int[6];
		array[0] = 100;
		array[1] = 80;
		array[2] = 50;
		array[3] = 90;
		array[4] = 100;
		array[5] = 8005;
		int sum = 0;
		for(int i = 0; i < array.length;i++) {
			sum = sum + array[i];
		}
		System.out.println("th sum is " + sum);
	}
}
