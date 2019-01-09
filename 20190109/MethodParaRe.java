package java_0109;

public class MethodParaRe {
	public static void main( String[] args) {
		
		int[] array = {40,50,70,80,12,12};
		System.out.println(array[0]);
		change(array);
		System.out.println(array[0]);
		
	}
	public static void change(int[] array) {
		array[0] *= 100;
	}
}
