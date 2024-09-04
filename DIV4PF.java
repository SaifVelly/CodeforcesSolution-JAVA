package probs;

import java.util.*;

public class DIV4PF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int r = scanner.nextInt();
            
            System.out.println(countLatticePoints(r));
        }
    }
    public static int countLatticePoints(int r) {
        int count = 0;
        for (int x = -r - 1; x <= r + 1; x++) {
            for (int y = -r - 1; y <= r + 1; y++) {
                double distance = Math.sqrt(x * x + y * y);
                if (distance >= r && distance < r + 1) {
                    count++;
                }
            }
        }
        return count;
    }

}
