package java_0114;

public class DemoPerson {
	public static void main(String [] args) {
		Person person = new Person("saisai",20,true);
		Person person1 = new Person();
		person1.setAge(10);
		person1.setName("qiang");
		
		
		person.sayHello("sicong");
		person.setAge(80);
		person.setName("zhaozaho");
		person.sayHello("xietingfeng");
		
		System.out.println(person1.getName() + person1.getAge() + "------" + person1.isMale());
	}
}
