package probs;
import java.util.Arrays;
import java.util.Scanner;


public class B1915 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		for(int k=0; k<t; k++) {
			int[][] array = new int[3][3];
			String str = scanner.nextLine();
			addtoarray(str, 0, array);
			String str1 = scanner.nextLine();
			addtoarray(str1, 1, array);
			String str2 = scanner.nextLine();
			addtoarray(str2, 2, array);
			
			int[] test = {0,0,0};
			//System.out.println(Arrays.deepToString(array));
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++) {
					
				}
			}
		}
	}



		private static void addtoarray(String str, int i, int[][] array) {
		    array[i][0] = str.charAt(0);
		    array[i][1] = str.charAt(1);
		    array[i][2] = str.charAt(2);
		}
	


	}




