package probs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1977 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            solve(a);
        }
        scanner.close();
    }

    public static List<List<Integer>> generateSubsequences(int[] arr) {
        List<List<Integer>> subsequences = new ArrayList<>();
        generateSubsequences(arr, 0, new ArrayList<>(), subsequences);
        return subsequences;
    }

    private static void generateSubsequences(int[] arr, int index, List<Integer> current, List<List<Integer>> subsequences) {
        if (index == arr.length) {
            subsequences.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[index]);
        generateSubsequences(arr, index + 1, current, subsequences);

        current.remove(current.size() - 1);
        generateSubsequences(arr, index + 1, current, subsequences);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static int calculateLCM(List<Integer> numbers) {


        int result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result = lcm(result, numbers.get(i));
        }
        return result;
    }

    public static boolean arrayContains(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void solve(int[] a) {
        List<List<Integer>> list = generateSubsequences(a);
        int max = 0;
        for (List<Integer> ls : list) {
            if (!ls.isEmpty() && !arrayContains(a, calculateLCM(ls)) && max < ls.size()) {
                max = ls.size();
            }
        }
        System.out.println(max);
    }
}
