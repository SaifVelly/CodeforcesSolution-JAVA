package probs;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySumDivisibleByThree {
    public static int minMoves(int[] arr) {
        int sum = 0;
        int[] remainderCount = new int[3];
        for (int num : arr) {
            sum += num;
            remainderCount[num % 3]++;
        }
        int moves = 0;
        int remainder = sum % 3;

        if (remainder == 1) {
            if (remainderCount[1] >= 1) {
                moves = 1;
            } else if (remainderCount[2] >= 2) {
                moves = 2;
            }
        } else if (remainder == 2) {
            if (remainderCount[2] >= 1) {
                moves = 1;
            } else if (remainderCount[1] >= 2) {
                moves = 2;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        // Exemple d'utilisation :
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int k = 0; k < t; k++) {
            int n = scanner.nextInt();
            int[] list = new int[n];
        
            int s = 0;

            for(int i = 0; i < n; i++) {
                int m = scanner.nextInt();
                list[i]=m;
                s += m;
            }         System.out.println(minMoves(list));
    }
}
}