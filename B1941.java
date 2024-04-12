package probs;
import java.util.Scanner;

public class B1941 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int k=0; k<t; k++) {
			int n = scanner.nextInt();
			int[] array = new int[n];
			for(int i=0; i<n; i++) {
				array[i]=scanner.nextInt();
			}
			
			
			if(solve(array)==true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
			
			
		
	}


	

	static boolean solve(int[] array) {
			    for (int i = 1; i <= array.length - 2; ++i) {
			      array[i] -= 2 * array[i - 1];
			      array[i + 1] -= array[i - 1];
			      if (array[i] < 0 || array[i + 1] < 0) {
			        return false;
			      }
			    }

			    return array[array.length - 2] == 0 && array[array.length - 1] == 0;
			  }


	

}
