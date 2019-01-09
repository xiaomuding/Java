package java_0109_class;

public class MobilePhone {
	String brand;
	double price;
	String color;
	
	public void call(String who) {
		System.out.println("call to " + who);
	}
	public void send() {
		System.out.println("send to all people");
	}
}
