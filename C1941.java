package probs;
import java.util.Scanner;

public class C1941 {
	public static void main (String args[]) {
	    Scanner scanner = new Scanner(System.in);
	    int t = scanner.nextInt();
	    scanner.nextLine(); 
	    for(int k=0; k<t; k++) {
	        int n = scanner.nextInt();
	        scanner.nextLine(); 
	        String string = scanner.nextLine();
	        
	        System.out.println(contains(string));
	        
	    }
	}


	private static int contains(String nextLine) {
		int b=0;
		int i = 0;
		while(i < nextLine.length()) {
		    if(i+2 < nextLine.length() && ("map".equals(nextLine.substring(i, i+3)) || "pie".equals(nextLine.substring(i, i+3)))) {
		        b++;
		        i=i+3;
		    }
		    else {
		    	i++;
		    }
		}

		return b;
	}


	}

