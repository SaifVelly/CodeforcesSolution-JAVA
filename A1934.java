package probs;
import java.util.Arrays;
import java.util.Scanner;

public class A1934 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int k=0; k<t; k++) {
			int n=scanner.nextInt();
			int[] array = new int[n];
			for(int i=0; i<n; i++) {
				array[i]=scanner.nextInt();
			}
			Arrays.sort(array);
			int r=Math.abs(array[n-1]-array[0])+Math.abs(array[n-2]-array[1]);
			System.out.println(2*r);
			

		}
	}
}
