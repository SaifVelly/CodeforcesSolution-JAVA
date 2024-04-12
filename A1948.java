package probs;

import java.util.Scanner;

public class A1948 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0; i<n; i++) {
			int m = scanner.nextInt();
			if(m%2==1) {
				System.out.println("NO");
			}
			else {
				String str = "";
				int r=0;
				for(int k=0; k<m/2; k++) {
					if(r%2==0) {
						str = str+"AA";
					}
					else{str = str+"BB";}
					r++;
					
				}
				System.out.println("Yes");
				System.out.println(str);
			}
		}
	}

}
