package probs;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr[0] == 0) {
                int prod = 1;
                for (int i = 1; i < n; i++) {
                    prod *= arr[i];
                }
                System.out.println(prod);
            } else {
                int prod = 1;
                for (int i = 0; i < n - 1; i++) {
                    prod *= arr[i];
                }
                prod *= (arr[n - 1] + 1);
                System.out.println(prod);
            }
        }
        sc.close();
    }
}
