package probs;
import java.util.*;
public class A791 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int res =0 ;
		while(a<=b) {
			a*=3;
			b*=2;
			res++;
		}
		System.out.println(res);

	}

}
