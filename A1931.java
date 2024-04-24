package probs;
import java.util.Scanner;
public class A1931 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
				
		for(int k=0; k<t; k++) {
			int n = scanner.nextInt();
			String str = "";
			int v = (n+96)/122;
			if(v>=2) {
				str = str + ((char) n+96 - 122);
				str +="zz";
				
			}
			else {
				if(v==1 || (n+96)%122 > 1 ) {
					str = str + "a";
					str = str + ((char) n+96-123);
					str=str+"z";
				}
				else {
					if(v==1) {
						str = str + "aa";
						str += "v";
					}
					else {
						str+="aa";
						str+= (char) n+96-2;	
					}
				}
			}
			System.out.println(str);
		}
	}
}
