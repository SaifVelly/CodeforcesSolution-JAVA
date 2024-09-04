package probs;

import java.util.Scanner;

public class B1722 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0) {
			int n = scanner.nextInt();
			scanner.nextLine();
			String line1 = scanner.nextLine();
			String line2 = scanner.nextLine();
			if(solve(line1, line2, n)) System.out.println("YES");
			else {
				System.out.println("NO");
			}
		}

	}

	private static boolean solve(String line1, String line2, int n) {
	    for(int i = 0; i < n; i++) {
	        char char1 = line1.charAt(i);
	        char char2 = line2.charAt(i);
	        if(char1 == 'G' && (char2 != 'B' && char2 != 'G')) return false;
	        if(char1 == 'B' && (char2 != 'B' && char2 != 'G')) return false;
	        if(char1 == 'R' && char2 != 'R') return false;
	    }
	    
	    return true;
	}

}
