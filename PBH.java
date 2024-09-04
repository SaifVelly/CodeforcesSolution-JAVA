package probs;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PBH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Long> v = new ArrayList<>();
        List<Long> last1 = new ArrayList<>();
        List<Long> last2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            v.add(x);
            v.add(y);
            if (i >= n / 2) {
                last1.add(x);
                last2.add(y);
            }
        }

        Collections.sort(v);
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < n / 2; i++) {
            s1.append("1");
            s2.append("1");
        }

        for (int i = 0; i < last1.size(); i++) {
            int dist1 = Collections.binarySearch(v, last1.get(i));
            if (dist1 >= n) {
                s1.append("0");
            } else {
                s1.append("1");
            }

            int dist2 = Collections.binarySearch(v, last2.get(i));
            if (dist2 >= n) {
                s2.append("0");
            } else {
                s2.append("1");
            }
        }

        while (s1.length() < n) {
            s1.append("0");
        }

        while (s2.length() < n) {
            s2.append("0");
        }

        System.out.println(s1);
        System.out.println(s2);
    }
}
