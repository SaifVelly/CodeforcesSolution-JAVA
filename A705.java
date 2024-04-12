package probs;

import java.util.Scanner;

public class A705 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		
		String txt = "I hate ";
		int r=1;
		
		
			for(int i=0; i<k/2 ; i++) {
				if(r%2!=0) {
					txt = txt + "that I love ";
				}
				else {
					txt = txt + "that I hate ";

				}

				r++;

				

			}
			System.out.println(txt);
			
		
		
		
		}
}
