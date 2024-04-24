package probs;
import java.util.Scanner;

public class A1927 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int k=0; k<t; k++) {
			int n = scanner.nextInt();
			scanner.nextLine();
			String str = scanner.nextLine();
			if(str.charAt(0)!='W'  &&  str.charAt(str.length()-1)!='W') {
				System.out.println(str.length());
			}
			else {
				int right=0;
				int left=0;
				int y=0;
				int z=0;
				while(str.charAt(y)=='W') {
					left++;
					y++;
				}
				while(str.charAt(str.length()-1-z)=='W') {
					right++;
					z++;
						
				}
				System.out.println(left==str.length()? 0 : str.length()-left-right);
			}
			
			
			
		}
	}
}
