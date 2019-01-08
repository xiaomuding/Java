package java_0108;

public class PrintArray {
	public static void main(String[] args) {
		int[] array = {20,30,40,50,3,3,3,3};
		PrintArray(array);
	}
	public static void PrintArray(int[] array){
		for(int i = 0;i < array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
