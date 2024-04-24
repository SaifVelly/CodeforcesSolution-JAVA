package probs;
import java.util.Arrays;
import java.util.Scanner;

public class B1926 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0) {
			int n = scanner.nextInt();
			scanner.nextLine();
			String[] array = new String[n];
			for(int i=0; i<n; i++) {
				array[i]=scanner.nextLine();
			}
			if(isSquare(array)) {
				System.out.println("SQUARE");
			}else {
				System.out.println("TRIANGLE");
			}
		}
	}
	
	private static boolean isSquare(String[] array) {
		int[] coo = firstOne(array);
		if(array[coo[0]].charAt(coo[1]+1)=='1'  && array[coo[0]+1].charAt(coo[1]+1)=='1' && array[coo[0]+1].charAt(coo[1])=='1') {
			return true;
		}
		else {
			return false;
		}

		
	}
	
	
	private static int[] firstOne(String[] array) {
		int[] res = new int[2];
		for(int i=0 ;i<array.length; i++) {
			for(int k=0; k<array[i].length(); k++) {
				if(array[i].charAt(k)=='1') {
					res[0]=i;
					res[1]=k;
					return res;
				}
			}
		}
		return res;
	}


}
