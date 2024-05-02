package probs;
import java.util.*;
public class B1969 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		while(t-->0) {
			String str = scanner.nextLine();
			long ones=0;
			long cost=0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)=='1') {
					ones++;
				}else if (str.charAt(i)=='0'  && ones!=0){
					cost+=ones+1;
				}
			}
			System.out.println(cost);
		}
	}
}
