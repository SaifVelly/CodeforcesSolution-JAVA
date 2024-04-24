package probs;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DIV2CONTEST {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t= scanner.nextInt();
		for(int k=0; k<t; k++) {
			int n = scanner.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			for(int i=0; i<n; i++) {
				int num = scanner.nextInt();
				if(map.containsKey(num)) {
					map.put(num, map.get(num)+1);
					
				} else {
					map.put(num,  1);
				}
				
			}
			
			int res =0;
			for(int value : map.values()){
				res += value/3 ;
				
			
				
			}
			System.out.println(res);
			
		}
	}
}
