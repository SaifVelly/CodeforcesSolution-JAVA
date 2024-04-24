package probs;
import java.util.Scanner;
public class A1933 {
	public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	int t = scanner.nextInt();
	for(int k=0; k<t; k++) {
		int n = scanner.nextInt();
		//int[] array = new int[n];
		int s=0;
		for(int i=0; i<n; i++) {
			s+=Math.abs(scanner.nextInt());
		}
		System.out.println(s);
		
		}
}
}
