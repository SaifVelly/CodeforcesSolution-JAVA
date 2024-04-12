package probs;

import java.util.Scanner;

public class A1957 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0; i<n; i++) {
			int X = scanner.nextInt();
			int Y = scanner.nextInt();
			
			if(X==0 && Y==0) {
				System.out.println(0);
			}
			else {
				int a = X*X + Y*Y;
				if(IsPerfectSqrt(a)) {
					System.out.println(1);
				}
				else {
					System.out.println(2);
				}
			}
			
		

			

		}
		
	}

	private static boolean IsPerfectSqrt(int a) {
		for(int i=1; i<=a; i++) {
			if(i*i==a) {
				return true;
			}
		}
		return false;
	}
}
