package probs;

import java.util.Scanner;
import java.util.Arrays;

public class A1976 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();

 
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            if (Arrays.equals(sArray, s.toCharArray())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
