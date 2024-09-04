package probs;

import java.util.Arrays;
import java.util.Scanner;

public class PBE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long f = scanner.nextLong();
        long[] a = new long[(int) n];

        long sum = 0;
        for (int i = 0; i < n; i++) {
            long k = scanner.nextLong();
            long l = scanner.nextLong();

            sum += Math.min(k, l);

            if (k >= l) {
                a[i] = 0;
            } else {
                a[i] = Math.min(2 * k, l) - Math.min(k, l);
            }
        }

        Arrays.sort(a);

        int i = (int) n - 1;
        while (f > 0 && i >= 0) {
            if (a[i] > 0) {
                sum += a[i];
                f--;
            }
            i--;
        }

        System.out.println(sum);
    }
}
