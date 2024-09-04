package probs;

import java.util.Scanner;

public class B1335 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                result.append((char) ('a' + i % b));
            }
            System.out.println(result);
        }
        
        scanner.close();
    }
}
