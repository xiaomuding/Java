
public class TimePrint {

	public static void main (String[] args) {
		for (int i = 0; i <24; i ++) {
			//System.out.print(i + "hour:");
			for (int j = 0;j < 60; j++) {
				System.out.println(i + "hour:"+ j + "minute");
			}
		}
	}
}
