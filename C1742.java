package probs;
import java.util.Scanner;
public class C1742 {

	// ra 3gezt nkmlo 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		
		String[] arr = new String[8];
		while(t-->0) {
			for(int i=0; i<8; i++) {
				String str =scanner.nextLine();
				arr[i] = str;
			}
		}

	}
	
	static boolean containP(String str) {
		for(int i=0; i<8; i++) {
			if(str.charAt(i)=='.') {
				return true;
			}
		}
		return false;
	}
	
	
	static void count(String str) {
		int Rs=0;
		int Bs=0;
		for(int i=0; i<8;i++) {
			if(str.charAt(i)=='R') {
				Rs++;
			}

		}
		
		System.out.println(Rs>4 ?  "R"  : "B");
	}


}
