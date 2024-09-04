package probs;

import java.util.*;


public class B2004 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			int intersection = Math.min(R, r)-Math.max(l,L);
			
			// First thins is to check if there is an intersection ?
			// If they do not intersect  il>ir -> sysout 1
			int res = intersection ;
			if(intersection+1<=0) {
				res=1;;
			} else {
				res += (l!=L) ? 1:0;
				res+=  (r!=R) ? 1:0;
			}
			System.out.println(res);
		}
		
	}

}
