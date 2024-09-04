package probs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class E1971 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int q = scanner.nextInt();
			int[] ai = new int[k];
			int[] bi = new int[k];
			for(int i=0; i<k; i++) {
				ai[i]=scanner.nextInt();				
			}
			for(int i=0; i<k; i++) {
				bi[i]=scanner.nextInt();
			}
			HashMap<Integer, Integer> hash = new HashMap<>();
			
			for(int i=0; i<k; i++) {
				hash.put(ai[i], bi[i]);
			}
			//Arrays.sort(ai);
		}
				

	}
	public static int findIndex(int[] array, int target) {
		int left =0;
		int right = array.length-1;
		int index =-1;
		while(left<=right) {
			int mid = left + (right - left)/2;
			if(array[mid] > target) {
				index = mid;
				right = mid -1;
				
			}
			else {
				left = mid +1;
			}
		}
		return index;
	}

}
