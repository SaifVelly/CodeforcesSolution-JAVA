package probs;

import java.util.Scanner;
 
public class A1979 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
 
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int m = scanner.nextInt();
            String a = scanner.next();
            String b = scanner.next();
 
            System.out.println(maximum(a, b));
        }
 
        scanner.close();
    }
 
    public static int maximum(String a, String b) {
        int pointerA = 0;
        int pointerB = 0;
 
        while (pointerB < b.length() && pointerA < a.length()) {
            if (a.charAt(pointerA) == b.charAt(pointerB)) {
                pointerA++;
            }
            pointerB++;
        }
 
        return pointerA;
    }
}