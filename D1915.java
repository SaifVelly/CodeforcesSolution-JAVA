package probs;
import java.util.Scanner;
public class D1915 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int k=0; k<t; k++) {
			int n = scanner.nextInt();
			scanner.nextLine();
			String str = scanner.nextLine();
			//System.out.println(str);
			String string ="";
			int i=0;
/*			while( i+2<str.length()) {
				if(str.charAt(i+2) == 'd' || str.charAt(i+2) == 'b' ||str.charAt(i+2) == 'c') {
					string += str.substring(i, i+3)+".";
					i+=3;
				}
				else {
					string+=str.subSequence(i, i+2);
					i=i+2;
				}
				
			}
			System.out.println(string.substring(0, string.length()-2));
					
					
		}*/
		
			while(!str.isEmpty()) {
			    if(str.length() > 2 && (str.charAt(2) == 'd' || str.charAt(2) == 'b' || str.charAt(2) == 'c')) {
			        string += str.substring(0, 3) + ".";
			        str = str.substring(3);
			    } else if (str.length() > 1) {
			        string += str.substring(0, 2) + ".";
			        str = str.substring(2);
			    } else {
			        string += str.substring(0, 1) + ".";
			        str = str.substring(1);
			    }
			}

			
			System.out.println(string);
		
		}
	}
}
