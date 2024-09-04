package probs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int aliceTotal = 0, bobTotal = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    aliceTotal += a[i];
                } else {
                    bobTotal += a[i];
                }
            }

            int diff = aliceTotal - bobTotal;
            if (diff > k) {
                diff -= k;
            } else {
                diff = 0;
            }

            System.out.println(diff);
        }
    }
}