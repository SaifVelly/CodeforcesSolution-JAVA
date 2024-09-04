package probs;

import java.util.Scanner;

public class C1948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean[] ok1 = new boolean[n+1 / 2];
            boolean[] ok2 = new boolean[n+1 / 2];
            for (int i = 0; i < 2; i++) {
                String s = sc.next();
                for (int j = 0; j < n; j++) {
                    if ((i + j) % 2 == 1) {
                        ok1[(i + j) / 2] |= (s.charAt(j) == '>');
                        ok2[(j - i + 1) / 2] |= (s.charAt(j) == '>');
                    }
                }
            }
            boolean ans = true;
            for (int i = 0; i < n / 2; i++) {
                ans &= ok1[i] && ok2[i];
            }
            System.out.println(ans ? "YES" : "NO");
        }
        sc.close();
    }
}
