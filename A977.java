package probs;
import java.util.Scanner;


public class A977 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		int k = scanner.nextInt();
		while(k-->0) {
			if(n%10 == 0) {
				n=n/10;
			}
			else {
				n=n-1;
			}
		}
		
		System.out.println(n);
				

	}

}
