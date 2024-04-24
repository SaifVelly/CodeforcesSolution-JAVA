package probs;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class A1915 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t= scanner.nextInt();
		for(int k=0 ; k<t; k++) {
			HashMap<Integer, Integer> map = new HashMap<>();
			for(int i=0; i<3; i++) {
			int key = scanner.nextInt();
			if(map.containsKey(key)) {
				map.put(key, 2);
			}
			else {
			map.put(key, 1);
				}


			
			
			}
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			    Integer KEY = entry.getKey();

			    Integer value = entry.getValue();
			    if(value==1) {
			    	System.out.println(KEY);
			    }
			}
		}
	}
}
