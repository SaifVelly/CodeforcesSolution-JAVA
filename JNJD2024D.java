package probs;
import java.util.*;
public class JNJD2024D {

    static final int MOD = 37;
    static final int PERIOD = 76;
    static long[] fib = new long[PERIOD];

    static { 
        buildFibonacci();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            int n = (int) modc(s, PERIOD);
            System.out.println(fib[n]);
        }
        scanner.close();
    }

    public static void buildFibonacci() {
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < PERIOD; i++) {
            fib[i] = (fib[i - 1]% MOD + fib[i - 2]% MOD) % MOD;
        }
    }

    public static long modc(String str, int mod) {
        long res = 0, p = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            res = (res + (str.charAt(i) - '0') * p) % mod;
            p = (p * 10) % mod;
        }
        return res;
    }
}
