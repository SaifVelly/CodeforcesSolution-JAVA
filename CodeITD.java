package probs;

import java.util.Scanner;

public class CodeITD {
    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        long[][] a = new long[(int) k][(int) k];
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k; j++) {
                if (i + 1 == j) a[i][j] = 1;
                else a[i][j] = 0;
            }
        }
        for (int i = 0; i < k; i++) a[(int) (k - 1)][i] = 1;

        long[][] b = binpow(a, n);
        System.out.println(b[(int) (k - 1)][(int) (k - 1)]);
    }

    private static long[][] multiple(long[][] a, long[][] b) {
        int n = a.length;
        long[][] c = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long sum = 0;
                for (int k = 0; k < n; k++) {
                    sum = (sum + a[i][k] * b[k][j]) % MOD;
                }
                c[i][j] = sum;
            }
        }
        return c;
    }

    private static long[][] binpow(long[][] a, long n) {
        int m = a.length;
        if (n == 0) {
            long[][] c = new long[m][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (i == j) c[i][j] = 1;
                    else c[i][j] = 0;
                }
            }
            return c;
        } else {
            long[][] b = binpow(a, n / 2);
            if (n % 2 == 0) {
                return multiple(b, b);
            } else {
                return multiple(multiple(b, b), a);
            }
        }
    }
}
