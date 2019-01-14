package java_0114;

public class Person {
	private String name;
	private int age;
	private boolean male;
	public Person() {
		System.out.println("start to create----");
	}
	public Person(int num) {
		System.out.println("start to create----" + num);
	}
	public Person(String who) {
		System.out.println("start to create----" + who);
	}
	
	public Person(String name ,int age, boolean male) {
		this.name = name;
		this.age = age;
		this.male = male;
		System.out.println("start to create----");
	}
	
	public void sayHello(String name) {
		System.out.println(name + " hello, my name is " + this.name + " may age is " + this.age);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public boolean isMale() {
		return this.male;
	} 
	public void setMale(boolean male) {
		this.male = male;
	}
	
		

}
