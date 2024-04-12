package probs;

import java.util.Scanner;

public class A1941 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0; i<t; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int k = scanner.nextInt();
			int[] arrayn = new int[n];
			int[] arraym = new int[m];
			for(int j=0; j<n; j++) {
				int r = scanner.nextInt();
				arrayn[j]=r;
			}
			for(int e=0; e<m; e++) {
				int r = scanner.nextInt();
				arraym[e]=r;
			}
			int w=0;
			for(int p=0; p<n; p++) {
				for(int o=0; o<m; o++) {
					if(arrayn[p]+arraym[o]<=k) {
						w++;
					}
				}
			}
			System.out.println(w);
			}
	}

}
