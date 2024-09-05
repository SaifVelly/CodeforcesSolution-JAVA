package probs;

import java.util.*;

public class C1873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[][] score = {
            {1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1}
        };
        
        while (t-- > 0) {
            int ans = 0;
            for (int i = 0; i < 10; i++) {
            	String str = sc.nextLine();
                for (int j = 0; j < 10; j++) {
                    if (str.charAt(j) == 'X') {
                        ans += score[i][j];
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
