package probs;

import java.util.Arrays;
import java.util.Scanner;

public class A1946 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int k = 0; k < t; k++) {
            int l = scanner.nextInt();
            int[] array = new int[l];
            for (int j = 0; j < l; j++) {
                array[j] = scanner.nextInt();
            }
            int[] ARRAY = array.clone();
            Arrays.sort(ARRAY);
            int min = 1;
            int max = 1;

            int i = 1;
            int j =1;

            while ((ARRAY[(l / 2) - i] == ARRAY[l / 2] || ARRAY[(l / 2) - i] == ARRAY[(l / 2) - i + 1]) && (l / 2 - i -1>= 0)) {
                i++;
                min++;
            }

            while ((ARRAY[(l / 2) + j] == ARRAY[l / 2] || ARRAY[(l / 2) + j] == ARRAY[(l / 2) + j - 1]) && (l / 2 + j - 1< l)) {
                j++;
                max++;
            }

            System.out.println(Math.min(max, min));
        }
    }
}
