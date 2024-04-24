package probs;
import java.util.Arrays;
import java.util.Scanner;


public class B1956 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0; i<t; i++) {
			int n = scanner.nextInt();
			int[] array = new int[n];
			for(int k=0; k<n; k++) {
				array[k]=scanner.nextInt();
			}
			Arrays.sort(array);
			int res=0;
			for(int j=1; j<n; j++) {
				if(array[j]==array[j-1]) {
					res++;
				}
			}
			
			System.out.println(res);
		}
	}
}
