package java_0220;

public class Return {
	public static void main(String[] args) {
		System.out.println(method1());
		System.out.println(method2()[2]);
		System.out.println(method3().replace("sd", "****"));
		System.out.println(method4().getName());
	}
	public static int method1() {
		return 10;
	}
	public static int[] method2() {
		
		int[] arr = {10,20,30};
		return arr;		
	}
	public static String method3() {
		return "sdfsdf";
	}
	public static Student method4() {
		Student stu = new Student("sdsf",80);
		return stu;
	}
}
