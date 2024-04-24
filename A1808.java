package probs;
import java.util.Scanner;

public class A1808 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int k = 0; k < t; k++) {
            int min = scanner.nextInt();
            int max = scanner.nextInt();
            int[] array = new int[max - min + 1];
            for(int i = 0; i < array.length; i++) {
                array[i] = min + i;
            }
            
            int res = -1;
            int matricule = 0;
            
            for(int j = 0; j < array.length; j++) {
                int MAX = 0;
                int MIN = Integer.MAX_VALUE;
                int n = array[j];
                while(n > 0) {	
                    int num = n % 10;
                    n = n / 10;
                    if(MIN > num) {
                        MIN = num;
                    }
                    if(MAX < num) {
                        MAX = num;
                    }
                }
                
                if(res < MAX - MIN) {
                    res = MAX - MIN;
                    matricule = array[j];
                }
            }
            System.out.println(matricule);
        }
        scanner.close();
    }
}
