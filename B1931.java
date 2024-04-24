package probs;
import java.util.Scanner;

public class B1931 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int k=0; k<t; k++) {
			int n = scanner.nextInt();
			int[] array = new int[n];
			int left=0;
			for(int i=0; i<n; i++) {
				array[i]=scanner.nextInt();
			}
			double acc=0;
			for(int i=0; i<n; i++) {
				acc+=array[i];
			}
			if(acc/n != (int) acc/n) {
				//System.out.println("NO");
			}
			else { 
				int r = (int) acc/n ;
				
				if(array[0]<r) {
					//System.out.println("NO");
				}
				else {
				for(int i=0; i<n; i++) {
					if(array[i]-r >0) {
						left+=array[i]-r;
						array[i]=r;
						}
					else{
						if(array[i]+left<r) {
							//System.out.println("NO");
							break;
						}
						else {
							left-=r-array[i];
							array[i]=r;
						}
					}
				  }
			   }
			}
		}
				
	}
}
