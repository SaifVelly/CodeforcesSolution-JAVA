package probs;

import java.util.*;

public class A2010 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0) {
			int one = 1;
			int n = scanner.nextInt();
			int sum =0;
			while(n-->0) {
				int a = scanner.nextInt();
				sum += one*a;
				one *= -1;
			}
			System.out.println(sum);
		}
		
	}

}
