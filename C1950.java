package probs;
import java.util.Scanner;

public class C1950 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		for(int i=0; i<t; i++) {
			String str = scanner.nextLine();
			String[] strArr = str.split(":");
			if(Integer.parseInt(strArr[0])<12) {
				System.out.println(str + " AM");
			}
			else {
				
				//str = "0"  + ":" + Integer.parseInt(strArr[1]) <=9 ? "0"+Integer.toString(Integer.parseInt(strArr[1])) :   ;
				System.out.println(str + " PM");
			}
			
					
		}
	}
}
