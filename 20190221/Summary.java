package java_0221;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Summary {
	public static void main(String[] args) throws IOException {
		//new a team
		ArrayList<Hero> list = new ArrayList<>();
		//read a file
		loadFileToList(list);
		System.out.println("add file to list");
		
		//check if the team is blank
		boolean isNew = list.size() == 0;
		System.out.println("is the team a new one?  : " + isNew);
		
		//if new
		if(isNew) {
			System.out.println("add player from file to list");
			addFiveHero(list);
		}else {
			System.out.println("no need to create");
		}
		//show the name and power of these players
		showHero(list);
		
		//int totalPower = totalPower(list);
		System.out.println("total power is " + totalPower(list));
		
		//if new , do something
		if(isNew) {
			//add list to file
			saveToFile(list);
			
		}else {
			//do nothing
		}
		System.out.println("game over");		
	}
	//new a method to read file
	public static boolean readFile(String fileName) {
		
		return true;
	}
	//new a method to read file to Array
	public static void loadFileToList(ArrayList<Hero> list) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("friend.txt"));
		String line;
		while((line = br.readLine()) != null) {
			//transfer string to Hero
			//line.split(",", 0);
			//how to tranfer string to int???
			String[] array = line.split(",");			
			int power = Integer.parseInt(array[1]);			
			list.add(new Hero(array[0], power,array[2]));			
		}
		br.close();
		
	}
	//new a method to a file
	public static void saveToFile(ArrayList<Hero> list) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("friend.txt"));
		for(int i=0;i<list.size();i++) {
			//transfer Hero to String
			String str = list.get(i).getName() + "," + list.get(i).getPower() + ","+ list.get(i).getType();
			bw.write(str);
			bw.newLine();
		}
		bw.close();
		
	}
	//new a method to get total power
	public static int totalPower(ArrayList<Hero> list) {
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			sum = sum +list.get(i).getPower();
		}
		return sum;
	}
	
	
	//new a method to show hero
	public static void showHero(ArrayList<Hero> list) {
		for(int i = 0;i<list.size();i++) {
			System.out.println("hero"+i+"'is "+list.get(i).getName()+"	power is "+list.get(i).getPower()+"	type is "+list.get(i).getType());
		}
	}
	//new a method to input palyer
	public static void addFiveHero(ArrayList<Hero> list) {
		Scanner sc = new Scanner(System.in);
		String name;
		int power;
		String type;	
		for(int i = 1;i <= 5; i ++) {
			System.out.println("please input player"+ i + "'s name");
			name = sc.next();
			System.out.println("please input player"+ i + "'s power");
			power = sc.nextInt();
			System.out.println("please input player"+ i + "'s type");
			type = sc.next();
			list.add(new Hero(name,power,type));
		}
		
		
	}
	
	
	
	
	
}
