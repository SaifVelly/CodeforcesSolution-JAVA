package probs;

import java.util.Scanner;
import java.util.ArrayList;

public class C1921 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TC = scanner.nextInt();
        while (TC-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int f = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList<Long> v = new ArrayList<>();
        v.add((long) 0); 
        for (int i = 0; i < n; i++) {
            v.add((long) scanner.nextInt());
        }
        for (int i = 1; i <= n; ++i) {
            long x = (v.get(i) - v.get(i - 1)) * a;
            f -= Math.min(x, b);
            if (f <= 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
