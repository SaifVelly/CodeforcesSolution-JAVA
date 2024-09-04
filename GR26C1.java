import java.util.Scanner;

public class MaxValueC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            System.out.println(findMaxC(arr));
        }
    }

    static long findMaxC(int[] arr) {
        long maxC = 0;
        long currentC = 0;
        boolean usedOption2 = false; // Flag to track if Option 2 has been used

        for (int num : arr) {
            long sum = currentC + num;
            if (sum < 0 && !usedOption2) { // Use Option 2 only if negative and not used yet
                currentC = Math.abs(sum);
                usedOption2 = true;
            } else {
                currentC += num; // Use Option 1 otherwise
            }
            maxC = Math.max(maxC, currentC); // Update maxC
        }

        return maxC;
    }
}
