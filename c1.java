package probs;

import java.io.*;
import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            long min = 0;
            long max = 0;
            for (int i = 0; i < N; i++) {
                int a = scanner.nextInt();
                min += a;
                max += a;
                if (-min > max)
                    max = -min;
            }
            pw.println(max);
        }

        pw.close();
        scanner.close();
    }
}
