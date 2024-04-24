package probs;

import java.util.Scanner;

public class B1931_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int k=0; k<t; k++) {
			int n = scanner.nextInt();
			double[] array = new double[n];
			double left=0;
			for(int i=0; i<n; i++) {
				array[i]=scanner.nextInt();
			}
			double acc=0;
			for(int i=0; i<n; i++) {
				acc+=array[i];
			}
			
			double r= acc/n;
			for(int i=0; i<n; i++) {
				if(array[i]-r >0) {
					left+=array[i]-r;
					array[i]=r;
					}
				else {

					left-=r-array[i];
					array[i]=r;
				}
					
				}
			System.out.println(eqint(array) ? "YES" : "NO");
			
			}
			
		

	}
	
	public static boolean eqint(double[] array) {
		return array[0]==(int) array[0];
	}
	
	

}
