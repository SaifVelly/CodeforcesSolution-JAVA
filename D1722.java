package probs;

import java.util.*;

public class D1722 {
    static final int MAX = 200007;
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tt = scanner.nextInt();
        for (int i = 1; i <= tt; i++) {
            solve(scanner);
        }
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        String s = scanner.next();
        long total = 0;
        ArrayList<Long> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                v.add((long) (n - 1 - i) - i);
                total += i;
            } else {
                v.add((long) i - (n - 1 - i));
                total += n - 1 - i;
            }
        }
        Collections.sort(v, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (v.get(i) > 0) { total += v.get(i); }
            System.out.print(total + " ");
        }
        System.out.println();
    }


}
