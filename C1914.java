package probs;

import java.util.*;

public class C1914 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] ai = new int[n];
			int[] bi = new int[n];
			for(int i=0; i<n; i++) {
				ai[i] = sc.nextInt();
			}
			for(int i=0; i<n; i++) {
				bi[i] = sc.nextInt();
			}
			int res = 0, sum = 0, max = 0;
            for (int i = 0; i < Math.min(n, k); i++) {
                sum += ai[i];
                max = Math.max(max, bi[i]);
                res = Math.max(res, sum + max * (k - i - 1));
            }

            System.out.println(res);
        	}
			
		}
	}


