package java_0109;

public class SumOfArray {
	public static void main(String[] args) {
		int[] array = {10,50,80,90,70};
		int sum = SumArray(array);
		System.out.println("sum is " + sum);
	}
	public static int SumArray(int[] array) {
		int sum = 0;
		for(int i = 0; i <array.length; i ++) {
			sum = sum + array[i];
		}
		return sum;
	}
}
