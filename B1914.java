package probs;

import java.util.*;

public class B1914 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int j = 0; j < t; j++) {
        	int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = n - i;
            }
            
            reverse(a, n - k - 1, n - 1);
            
            for (int i = 0; i < n; i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(a[i]);
            }
            System.out.println();

        }
        
        scanner.close();
    }


    private static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
