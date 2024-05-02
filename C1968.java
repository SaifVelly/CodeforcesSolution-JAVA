package probs;

import java.util.Scanner;

public class C1968 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] x = new int[n];
            int[] a = new int[n];

            for (int i = 1; i < n; i++) {
                x[i] = scanner.nextInt();
            }

            a[0] = x[1];

            for (int i = 1; i < n; i++) {
                a[i] = (a[i - 1] + x[i]) % a[i - 1];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
