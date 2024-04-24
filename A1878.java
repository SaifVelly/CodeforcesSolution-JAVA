package probs;
import java.util.Scanner;

public class A1878 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int k=0; k<t; k++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int[] array = new int[n];
			for(int i=0; i<n; i++) {
				array[i]=scanner.nextInt();
						
			}
			
			if(solve(array, m)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
		
		
		
	}

	private static boolean solve(int[] array, int m) {
		for(int i = 0; i<array.length ;i++) {
			//Scanner scanner = new Scanner(System.in);
			if(array[i]==m) {
				return true;
			}
			
		}
		return false;
	}


}
