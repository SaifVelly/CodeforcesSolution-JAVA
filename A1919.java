package probs;

import java.util.Scanner;

public class A1919 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int k=0; k<t; k++) {
			long a=scanner.nextInt();
			long b = scanner.nextInt();
			if((a+b)%2==0) {
				System.out.println("Bob");
				
			}
			else {
				System.out.println("Alice");
			}
					
		}
		
	}
}
