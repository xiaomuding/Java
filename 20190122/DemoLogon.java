package java_0122;
import java.util.*;

public class DemoLogon {
	 public static void main(String[] args) {
		 String RegisterName = "admin";
		 String RegisterPassword = "123456";
		 Scanner sc = new Scanner(System.in);
		 System.out.println("please input username");
		 String Username = sc.next();
		 System.out.println("please input password");
		 String Password = sc.next();
		 if (RegisterName.equalsIgnoreCase(Username) && RegisterPassword.equals(Password)) {
			 System.out.println(" welcome ");
		 }else if(!RegisterName.equals(Username)){
			 System.out.println("username invalid");
		 }else {
			 System.out.println("password invaild");
		 }
	 }
}
