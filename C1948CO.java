package probs;

import java.util.Scanner;

public class C1948CO {
    public static void resolve(Scanner sc) {
        long n = sc.nextLong();
        char[][] arr = new char[2][(int) n];
        String s;

        s = sc.next();
        for (int i = 0; i < n; i++) {
            arr[0][i] = s.charAt(i);
        }

        s = sc.next();
        for (int i = 0; i < n; i++) {
            arr[1][i] = s.charAt(i);
        }

        if (arr[1][(int) n - 2] == '<') {
            System.out.println("NO");
            return;
        }

        long x = 1;
        long y = n - 2;
        while (y > 0) {
            if (arr[(int) ((x + 1) % 2)][(int) y - 1] == '>') {
                x = (x + 1) % 2;
                y = y - 1;
            } else if (y >= 2 && arr[(int) x][(int) y - 2] == '>') {
                y = y - 2;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            resolve(sc);
        }
        sc.close();
    }
}
