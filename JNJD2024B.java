package probs;

import java.util.*;


////////////Lcode makamelch /////////////



public class JNJD2024B {
    public static long[] build(List<Long> nums) {
        int MAX = 200005; // Adjust the value of MAX as needed
        long[] a = new long[MAX]; // count of each number i -> i
        long[] b = new long[MAX << 1]; // count of each duplicate pair i -> 2 * i

        for (long num : nums) {
            a[(int) num] += 1;
            b[(int) (2 * num)] += 1;
        }

        // generate all possible pairs (i, j)
        long[] res = multiply(a, a);
        for (long i : nums) {
            // remove the repeated duplicates (i, i) -> 2 * i
            res[(int) (2 * i)] -= 1;
        }

        // generate all possible triples (i, j, k) where i != j
        res = multiply(res, a);

        // generate all possible triples (i, j, j)
        long[] repeat = multiply(a, b);
        for (long i : nums) {
            // don't count the case where i = j (i, i, i) -> 3 * i
            repeat[(int) (3 * i)] -= 1;
        }

        // remove the repeated duplicates (i, i, j) & (j, j, i)
        for (int i = 0; i < repeat.length; i++) {
            res[i] -= 2 * repeat[i];
        }

        return res;
    }

    // Helper method to multiply two arrays element-wise
    private static long[] multiply(long[] arr1, long[] arr2) {
        int n = arr1.length;
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] * arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        List<Long> nums = Arrays.asList(1L, 2L, 3L, 2L, 1L);
        long[] result = build(nums);
        System.out.println(Arrays.toString(result));
    }
    public static long choose(int n, int k) {
        if (k > n) {
            return 0;
        }
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result *= n - (k - i);
            result /= i;
        }
        return result;
    }

}
