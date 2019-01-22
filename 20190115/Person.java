package java_0115;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	public Person() {	
	}
	public void sayHello( String name) {
		System.out.println("my name is " + this.name +" it is greate to meet you : " + name + ". i am " + this.age + " years old" );
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
