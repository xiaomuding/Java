package java_0128;

public class Hero {
	private String role;
	private int attack;
	public Hero(){
		
	}
	public Hero(String role, int attack) {
		super();
		this.role = role;
		this.attack = attack;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
}
