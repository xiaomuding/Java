package java_0109_class;

public class PhoneOne {
	public static void main(String[] args) {
		MobilePhone one = new MobilePhone();
		System.out.println(one.price + one.brand + one.color);
		one.brand = "apple";
		one.price = 8.8;
		one.color = "red";
		System.out.println(one.price + one.brand + one.color);
		one.call("qiaobusi");
		one.send();
		
		MobilePhone two = one;
		two.brand = "sunming";
		two.price = 4585.21;
		two.color = "green";
		System.out.println(one.price + one.brand + one.color);
		
				
		
	} 
}
