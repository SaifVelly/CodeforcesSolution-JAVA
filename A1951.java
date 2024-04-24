package probs;
import java.util.Scanner;

public class A1951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int k = 0; k < t; k++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String num = scanner.nextLine();
            if(isPossible(num)) {
            	System.out.println("YES");
            	
            }
            else {
            	System.out.println("NO");
            }
            
            
        }
    }

    
    public static boolean isPossible(String s) {
        int ns = s.length();
        int one = 0;
        
        for (int i = 0; i < ns; i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                one++;
            }
        }
        
        if (one == 0) return true;
        
        if ((ns - 4 * one) % 2 == 0) return true;
        
        else if (one == 2) {
            int fi = s.indexOf('1');
            int si = s.lastIndexOf('1');
            
            if (si == fi + 1) return false;
            
            else return true;
        }
        
        else return false;
    }

    
    
    
	/*
	 * private static int indexOfFirst(String num) { for (int i = 0; i <
	 * num.length(); i++) { if (num.charAt(i) == '1') { return i; } } return -1; }
	 * 
	 * private static int indexOfLast(String num) { for (int i = 0; i <
	 * num.length(); i++) { if (num.charAt(num.length() - 1 - i) == '1') { return
	 * num.length() - 1 - i; } } return -1; }
	 */
}
