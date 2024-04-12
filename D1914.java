package probs;

import java.util.Arrays;
import java.util.Scanner;

public class D1914 {

    static class Pair implements Comparable<Pair> {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int compareTo(Pair other) {
            return Integer.compare(other.first, this.first);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Pair[][] arr = new Pair[3][n];

            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < n; ++j) {
                    arr[i][j] = new Pair(scanner.nextInt(), j);
                }
                Arrays.sort(arr[i]);
            }

            int result = 0;
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    for (int k = 0; k < 3; ++k) {
                        if (arr[0][i].second != arr[1][j].second && arr[1][j].second != arr[2][k].second
                                && arr[0][i].second != arr[2][k].second) {
                            result = Math.max(result, arr[0][i].first + arr[1][j].first + arr[2][k].first);
                        }
                    }
                }
            }
            System.out.println(result);
        }
        scanner.close();
    }


}
