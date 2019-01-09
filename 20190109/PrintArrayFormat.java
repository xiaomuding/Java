package java_0109;

public class PrintArrayFormat {
	public static void main(String[] args){
		int[] array = {10,20,30,40,50,60};
		PrintArray(array);
	}
	public static void PrintArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length;i ++) {
			
			if (i == array.length - 1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i] + ",");
			}
		}
		System.out.println("]");
	}
}
