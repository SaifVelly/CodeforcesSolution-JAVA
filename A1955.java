package probs;
import java.util.Scanner;

public class A1955 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0; i<t; i++) {
			int n = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(Math.min((n/2)*b + (n%2)*a, n*a));
					
		}
				
	}
}
