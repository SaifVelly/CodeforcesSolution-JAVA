package probs;

import java.util.Scanner;

public class A1954 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            double maxColor = (double) (n + m - 1) / m;

            if (maxColor + k >= n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

       
    }
}
