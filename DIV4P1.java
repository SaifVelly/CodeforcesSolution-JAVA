package probs;
import java.util.*;

public class DIV4P1 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
        	String str = scanner.nextLine();
        	if(siEqual(str) || isArranged(str)) {
        		System.out.println(1);
        	}else {
        		if(isSortedDecrementally(str)) {
        			System.out.println(2);
        		}
        		else {
        		System.out.println(CUT(str));
        	}
        	}
        }
        scanner.close();
    }

    private static boolean isArranged(String str) {
    	int[] array = new int[str.length()];
    	for(int i=0; i<str.length(); i++) {
    		array[i] = (int) str.charAt(i);
    	}
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false; 
            }
        }
        return true; 
    
	}

	private static boolean siEqual(String str) {
		char k = str.charAt(0);
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i)!=k) {
				return false;
			}
		}
		return true;
	}
    public static boolean isSortedDecrementally(String str) {
    	int[] array = new int[str.length()];
    	for(int i=0; i<str.length(); i++) {
    		array[i] = (int) str.charAt(i);
    	}
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

	public static int CUT(String str) {
        int cuts = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == '1' && str.charAt(i + 1) == '0') || (str.charAt(i) == '0' && str.charAt(i + 1) == '1')){
                cuts++;
            }
        }
        return cuts;
    }
}
