package java_0115;

public class DemoPerson {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("ya sa");
		person1.setAge(20);
		
		Person person2 = new Person("laji" , 200);
		
		person2.sayHello(person1.getName());
		
		person1.sayHello(person2.getName());
	}
}
