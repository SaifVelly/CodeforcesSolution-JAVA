package probs;
import java.util.ArrayList;
import java.util.Scanner;

public class B1933 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int k = 0; k < t; k++) {
            ArrayList<Integer> list = new ArrayList<>();
            int n = scanner.nextInt();
            int s = 0;
            for(int i = 0; i < n; i++) {
                int m = scanner.nextInt();
                list.add(m);
                s += m;
            }
            int l = s % 3;
            if(l == 0) {
                System.out.println(0);
            } 
            
            else {
            	if(l==2 && containsDivisibleByTwo(list)) {
            		System.out.println(1);
            	}
            	else {
            		if(l==1) {
            			System.out.println(1);
            		}
            		else {
            			System.out.println(2);
            		}
            	}
            }
            
            
            
            
            
            
            
			/*
			 * else if(l == 2) { if(containsDivisibleByTwo(list)) { System.out.println(1); }
			 * else { System.out.println(2); } } else {
			 * 
			 * }
			 */
        }
        scanner.close(); 
    }

    // Méthode pour vérifier si la liste contient un nombre pair
    private static boolean containsDivisibleByTwo(ArrayList<Integer> list) {
        for(int num : list) {
            if(num % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}
