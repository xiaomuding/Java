import java.util.Scanner;


@SuppressWarnings("unused")
public class TestScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input your score");
		int score = sc.nextInt();
		System.out.println(score);
		if(score >= 90 && score <= 100) {
			System.out.println("perfect");
		}else if (score >= 80 && score < 90) {
			System.out.println("good");
		}else if (score >= 70 && score < 80) {
			System.out.println("normal");
		}else {
			System.out.println("laji");
		}sc.close();
	}
}
