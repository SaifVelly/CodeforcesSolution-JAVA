package probs;

import java.util.Scanner;

public class A1951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            int cnt = 0, mi = n, mx = -1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    cnt++;
                    mi = Math.min(mi, i);
                    mx = Math.max(mx, i);
                }
            }
            System.out.println((cnt % 2 == 1 || (cnt == 2 && mx - mi == 1)) ? "NO" : "YES");
        }
        scanner.close();
    }
}
