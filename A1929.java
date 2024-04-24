package probs;
import java.util.Arrays;
import java.util.Scanner;
public class A1929 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int k=0; k<t; k++) {
			int n = scanner.nextInt();
			int[] array = new int[n];
			for(int i=0; i<n; i++) {
				array[i]=scanner.nextInt();
			}
			Arrays.sort(array);
			int res=0;
			for(int j=1; j<n; j++) {
				res+=array[j]-array[j-1];
			}
			System.out.println(res);
		}
	}
}
