package probs;
import java.util.*;

public class CB1969 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			if (n > 1)		
			extracted(scanner, n, k);
			else
				System.out.println(scanner.nextInt());
					
		}

	}

	private static void extracted(Scanner scanner, int n, int k) {
		int[] diff = new int[n-1];
		diff[0] = scanner.nextInt();

		int sum =0;
		int m;
		//int[] diff = new int [n-1];
		for(int i=0; i<n-1; i++) {
			m = scanner.nextInt();
			
			diff[i] = Math.abs(diff[i]-m);
			sum+=diff[i];
		}
		int p=0;
		while(p<k) {
			Arrays.sort(diff);
			sum-=diff[n-2];
			diff[n-2]=0;
			p++;
		}
		System.out.println(sum);
	}

}
