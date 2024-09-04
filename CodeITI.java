package probs;

import java.util.Arrays;
import java.util.Scanner;

public class CodeITI {
    private static final int MAXN = 301;
    private static final long INF = (long) 1e14;
    private static long[][] dist = new long[MAXN][MAXN];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();

        for (long[] row : dist) {
            Arrays.fill(row, INF);
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            dist[a][b] = 1;
        }
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        while  (q-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (dist[a][b] == INF) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scanner.close();
    }
}
