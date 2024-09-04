package probs;

import java.util.Scanner;
import java.util.Arrays;

public class B1976 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            long[] b = new long[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            for (int i = 0; i < n + 1; i++) {
                b[i] = scanner.nextLong();
            }
            long sum = 0, ext = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                sum += Math.abs(a[i] - b[i]);
                ext = Math.min(ext, Math.abs(a[i] - b[n]));
                ext = Math.min(ext, Math.abs(b[i] - b[n]));
                if (Math.min(a[i], b[i]) <= b[n] && b[n] <= Math.max(a[i], b[i]))
                    ext = 0;
            }
            System.out.println(sum + ext + 1);
        }
    }
}
