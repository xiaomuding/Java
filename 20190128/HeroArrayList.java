package java_0128;

import java.util.ArrayList;

public class HeroArrayList {
	public static void main(String[] args) {
		ArrayList<Hero> team1 = new ArrayList<>();
		ArrayList<Hero> team2 = new ArrayList<>();
		team1.add(new Hero("yuji",85));
		team2.add(new Hero("sdf",95));
		System.out.println(team1.get(0).getRole());
	}
}
