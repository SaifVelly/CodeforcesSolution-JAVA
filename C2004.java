package probs;

import java.util.*;

public class C2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            
            Arrays.sort(a);
            reverseArray(a);

            long score = 0L;
            int rem = k;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    score += a[i];
                } else {
                    int needed = Math.min(rem, a[i - 1] - a[i]);
                    a[i] += needed;
                    rem -= needed;
                    score -= a[i];
                }
            }
            System.out.println(score);
        }
        sc.close();
    }

    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
