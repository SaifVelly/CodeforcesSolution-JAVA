package probs;

import java.util.Scanner;

public class ttfingers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double l = (double) scanner.nextInt();
            
            int k = Integer.MAX_VALUE;
            int r=1;
            int y=1;
            double p = -1;
            while(k>1) {
            	if(p - k ==0) {
            		 p = l / Math.pow((double) b, (double) y);
            		 k = (int) p;
            		 r++;
            		 
            		 
            	}
            	y++;
            }
            System.out.println(r);
        }
            
	

}