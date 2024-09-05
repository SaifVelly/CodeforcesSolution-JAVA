package probs;

import java.util.*;

public class A1837 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String abc = "abc";
        while (t-- > 0) {
        	int diff=0;
        	String str =sc.nextLine();
            for(int i=0 ; i<3; i++) {
            	if(str.charAt(i)!=abc.charAt(i)) diff++;
            }
            if(diff<=2) System.out.println("YES");
            else {
            	System.out.println("NO");
            }
            	
        }
        sc.close();
    }

}
