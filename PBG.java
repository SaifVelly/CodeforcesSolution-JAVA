package probs;

import java.util.Scanner;

public class PBG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean[] even = new boolean[n];
        for (int j = 0; j < n; j++) {
            arr[j] = scanner.nextInt();
            if (arr[j] % 2 == 0) {
                even[j] = true;
            }
        }
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            ans = gcd(ans, arr[i]);
        }
        if (ans > 1) {
            System.out.println("YES");
            System.out.println("0");
            return;
        }
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (!even[i]) {
                if (!even[i + 1])
                    sum++; 
                else if (even[i + 1])
                    sum += 2; 

                even[i] = true;
                even[i + 1] = true;
            }
        }
        if (!even[n - 1])
            sum += 2;

        System.out.println("YES");
        System.out.println(sum);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
