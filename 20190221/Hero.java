package java_0221;

public class Hero {
	private String name;
	private int power;
	private String type;
	public Hero() {
		
	}
	public Hero(String name, int power, String type) {
		//super();
		this.name = name;
		this.power = power;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
