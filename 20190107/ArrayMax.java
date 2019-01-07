package java_0107;

public class ArrayMax {
	public static void main(String[] args) {
		int[] array = {5,10,20,40,5000,50};
		int max = array[0];
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		for(int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				max = array[i];
			}
		}
		System.out.println("the max num is " + max);
		System.out.println("the min num is " + min);
	}

}
