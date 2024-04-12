package probs;
import java.util.Scanner;


//wrong answer on test 2  //khass n comparehom wa7d b wa7d l3adi m3a reverse 

public class A1935 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int testcase = 0; testcase < t; testcase++) {
            int even = scanner.nextInt();
            scanner.nextLine();
            String string = scanner.nextLine();
            
            
    		
    		  //int k=0;
				/*
				 * while(string.charAt(string.length() - 1 -k)<string.charAt(k)) { k++; }
				 */    		  
    		  
    		 /* if(k>=2 && string.charAt(string.length() - 1)<string.charAt(0)  || string.charAt(string.length() - 1)<string.charAt(0) ) {
    			  System.out.println((new StringBuilder(string)).reverse().toString()+string); 
    		  }*/
    		  if((new StringBuilder(string)).reverse().toString().compareTo(string)<0) {
    			  System.out.println((new StringBuilder(string)).reverse().toString()+string); 

    		  }
    		         
            
            
            
/*            if(string.charAt(string.length() - 1)<string.charAt(0)) {
            	System.out.println((new StringBuilder(string)).reverse().toString()+string);
            }*/
            else {
            	System.out.println(string);
            
        }
            

      }


	}


}
