package probs;

import java.util.Scanner;

public class PBC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long s = scanner.nextLong();
            long res = 0;
            long pow = 1;
            for (long p = 9; p > 0; p--) {
                if (p > s) {
                    continue;
                }
                res += pow * p;
                pow *= 10;
                s -= p;
            }
            System.out.println(res);
        }
    }
}
