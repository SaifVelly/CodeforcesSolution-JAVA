package probs;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine()); 
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            String[] tokens = reader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }
            System.out.println(countTuples(arr));
        }
    }

    static int countTuples(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int x = 0; x < n; x++) {
            for (int y = x; y < n; y++) {
                for (int z = y; z < n; z++) {
                    long fx = calculateF(arr, x, y);
                    long fy = calculateF(arr, y, z);
                    long fz = calculateF(arr, x, z);
                    if ((fx ^ fy) > fz) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static int calculateF(int[] arr, int l, int r) {
        int result = 0;
        for (int i = l; i <= r; i++) {
            result ^= arr[i];
        }
        return result;
    }
}
