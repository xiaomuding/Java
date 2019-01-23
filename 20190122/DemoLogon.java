package java_0122;
import java.util.*;

public class DemoLogon {
	 public static void main(String[] args) {
		 String RegisterName = "admin";
		 String RegisterPassword = "123456";
		 Scanner sc = new Scanner(System.in);
		 for(int i = 1;i < 4; i++) {
			 System.out.println("please input username");
			 String Username = sc.next();
			 System.out.println("please input password");
			 String Password = sc.next();
			 if (RegisterName.equalsIgnoreCase(Username) && RegisterPassword.equals(Password)) {
				 System.out.println(" welcome ");
				 break;
			 }else if(!RegisterName.equals(Username)){
				 if(i == 3) {
					 System.out.println("locked");
				 }else {
					 System.out.println("username invalid, you can try " + (3-i) +"times");
				 }
				 
			 }else {
				 if(i == 3) {
					 System.out.println("locked");
				 }else {
					 System.out.println("username invalid, you can try " + (3-i) +"times");
				 }
			 }
		 }
		 
	 }
}
