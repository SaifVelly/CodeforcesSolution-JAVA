package probs;
import java.util.Scanner;

public class LazyKssim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            h[i] = scanner.nextInt();
        }

        int[] dp = new int[n + 1];
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(h[i] - h[i - 1]),
                             dp[i - 2] + Math.abs(h[i] - h[i - 2]));
        }

        System.out.println(dp[n]);
    }
}
