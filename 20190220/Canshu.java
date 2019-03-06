package java_0220;

public class Canshu {
	public static void main(String[] args) {
		method(10);
		int[] arr = {10,20,60};
		method2(arr);
		method3("how do you do");
		method4(new Student("xiaoqiang",20));
	}

	private static void method(int i) {
		System.out.println(10*i);
		
	}
	public static void method2(int[] Array) {
		System.out.println(Array[2] + Array[1]);
	}
	
	public static void method3(String str) {
		String res = str.replace("o", "*****");
		System.out.println(res);
	}
	public static void method4(Student stu) {
		
		System.out.println("name:" + stu.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	
} 
