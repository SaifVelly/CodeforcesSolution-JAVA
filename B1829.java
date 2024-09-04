package probs;

import java.util.Scanner;
public class B1829 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0) {
			int n = scanner.nextInt();
			int res=0;
			int big=0;
			while(n-->0) {
				int m = scanner.nextInt();
				if(m==0) {
					res++;
				} else {
					big=Math.max(res, big);
					res=0;
				}
			}
			System.out.println(Math.max(res, big));
		}

	}

}
