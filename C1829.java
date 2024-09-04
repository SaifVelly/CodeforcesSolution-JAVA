package probs;

import java.util.*;

public class C1829 {
    private static final int INF = (int) 1e9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            solve(scanner);
        }

        scanner.close();
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        Map<String, Integer> mp = new HashMap<>();
        mp.put("00", INF);
        mp.put("01", INF);
        mp.put("10", INF);
        mp.put("11", INF);

        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();
            String s = scanner.next();
            mp.put(s, Math.min(mp.get(s), x));
        }

        int ans = Math.min(mp.get("11"), mp.get("10") + mp.get("01"));
        if (ans > (int) 1e6) {
            System.out.println("-1");
        } else {
            System.out.println(ans);
        }
    }
}
