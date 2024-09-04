package probs;

import java.util.Scanner;

public class B1957 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];

            if (n == 1) {
                a[0] = k;
            } else {
                int msb = findMSB(k);
                a[0] = (1 << msb) - 1;
                a[1] = k - a[0];
                for (int i = 2; i < n; i++) {
                    a[i] = 0;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static int findMSB(int k) {
        for (int i = 31; i >= 0; i--) {
            if ((k & (1 << i)) != 0) {
                return i;
            }
        }
        return -1; 
    }
}
