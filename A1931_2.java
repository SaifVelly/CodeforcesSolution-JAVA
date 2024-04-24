package probs;

import java.util.Scanner;

public class A1931_2 {
	public static void main(String args[]) {
		char[] array = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		System.out.println(array[25]);
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
				
		for(int k=0; k<t; k++) {
			int n = scanner.nextInt();
			String str = "";
			if(n>=26) {
				str+=array[25];
				n=n-26;
				
				
			}
			else {
				
			}
			
			
			
			System.out.println(str);
		}
	}
}
