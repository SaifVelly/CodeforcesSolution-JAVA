package probs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class A1966 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			int s=0;
			for(int i=0; i<n; i++) {
				int m =scanner.nextInt();
				if(map.containsKey(m) && map.get(m)<k-1 ) {
					map.put(m, map.get(m)+1);
				}else if(map.containsKey(m) && map.get(m)==k-1){
					map.remove(m);
					s+=k-1;	
				}
				else {
					map.put(m, 1);
				}
			}
			List<Integer> sortedValues = new ArrayList<>(map.values());
		    Collections.sort(sortedValues, Collections.reverseOrder());
		    int res=0;
			for ( int v : sortedValues) {
				if ( s-k+v>=0) {
					s-=k-v;
					s+=k-1;
				}else {
					res+=v;
				}	
			res+=s;	
			}
			System.out.println(res);			
			}
		
	
		}
		
	}