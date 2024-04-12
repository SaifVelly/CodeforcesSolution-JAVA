package probs;

import java.util.Arrays;
import java.util.Scanner;

public class C1931 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int k=0 ; k<t; k++) {
			int n = scanner.nextInt();
			int[] array = new int[n];
			for(int y=0; y<n; y++) {
				array[y] = scanner.nextInt();
			}
			
			int repleft = 0;
			int r = 0;
			while (r < n && array[0] == array[r]) {
			    repleft++;
			    r++;
			}
			int j = n - 1;
			int repright = 0;
			while (j >= 0 && array[n - 1] == array[j]) {
			    repright++;
			    j--;
			}

			if (array[0] == array[n - 1] && repright!=n) {
			    System.out.println(n - (repright + repleft));
			}
			/*
			 * if(repright==n || repleft==n) { System.out.println(0); }
			 */
			
			else {
			    System.out.println(n - Math.max(repright, repleft));
			}

			
			
			
			
			//System.out.println(Arrays.toString(array));
			
		}
	}
}
