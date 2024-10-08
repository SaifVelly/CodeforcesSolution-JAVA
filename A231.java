package probs;

import java.util.Scanner;
public class A231 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int ans = 0;

	        while (n-- > 0) {
	            int countOfSolvers = 0;

	            for (int i = 0; i < 3; i++) {
	                countOfSolvers += scanner.nextInt();
	            }

	            if (countOfSolvers >= 2) {
	                ans++;
	            }
	        }

	        System.out.println(ans);
	    }
	}
