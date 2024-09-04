package probs;

import java.util.Scanner;

public class CodeItA {
    static void solve(long a, long b, long left, long right, long[] ans) {
        if (a < left || a > right || b < left || b > right) return;
        ans[0]--;
        long tmp = (right + left) / 2;
        solve(a, b, left, tmp, ans);
        solve(a, b, tmp + 1, right, ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long q = scanner.nextLong();

        while (q-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long[] ans = { (long) (Math.log(n) / Math.log(2)) + 1 };
            solve(a, b, 1, n, ans);
            System.out.println(ans[0]);
        }
    }
}
