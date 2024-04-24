package probs;
import java.util.Scanner;

public class D1811 {
	public static void main(String[] args) {
		
		System.out.println(Fibonacci(3));
		
	}
	
	private static int Fibonacci(int n) {
		
		int[] array = new int[n+1];
		array[0]=1;
		array[1]=1;
		for(int i=2; i<n+1 ; i++) {
			array[i]= array[i-1] + array[i-2];
		}
		return array[n];
		
	}
}
