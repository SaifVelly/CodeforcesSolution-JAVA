package probs;
import java.util.*;

public class A1945 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0; i<t; i++) {
			long a = scanner.nextInt();
			long b = scanner.nextInt();
			long c = scanner.nextInt();
			if(c+(b%3) < 3  && b%3!=0)  {
				System.out.println(-1);
				// 1 3 2
			}
			else {
				System.out.println(((3*a + b + c)/3)  + ((3*a + b + c)%3==0 ? 0:1));
			}
		}

	}

}
