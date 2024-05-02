package probs;
import java.util.*;

public class D1968 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            long Pb = scanner.nextInt();
            long Ps = scanner.nextInt();
            long[] p = new long[n];
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = scanner.nextLong();
            }
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int scoreBoba = a[(int) (Pb - 1)];
            int scoreSasha = a[(int) (Ps - 1)];
            for (int j = 1; j < k; j++) {
                int nextPb = (int) p[(int) (Pb - 1)];
                int nextPs = (int) p[(int) (Ps - 1)];
                if (nextPb >= n || nextPs >= n) {
                    break;
                }
                if (a[nextPb] > a[(int) (Pb - 1)]) {
                    scoreBoba += a[nextPb];
                    Pb = nextPb;
                } else {
                    scoreBoba += a[(int) (Pb - 1)];
                }

                if (a[nextPs] > a[(int) (Ps - 1)]) {
                    scoreSasha += a[nextPs];
                    Ps = nextPs;
                } else {
                    scoreSasha += a[(int) (Ps - 1)];
                }
            }
            //System.out.println("for " + t +" "+ scoreBoba +" " +scoreSasha);
            if (scoreBoba > scoreSasha) {
                System.out.println("Bodya");
            } else if (scoreBoba < scoreSasha) {
                System.out.println("Sasha");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
