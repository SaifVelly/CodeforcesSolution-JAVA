package probs;
import java.util.HashSet;
import java.util.Scanner;


public class A1722 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0) {
			int n=scanner.nextInt();
			scanner.nextLine();
			String str = scanner.nextLine();

			if(n!=5) System.out.println("NO");
			else {
				HashSet<Character> set = new HashSet<>();
				set.add('T');
				set.add('i');
				set.add('m');
				set.add('u');
				set.add('r');
				for(int i=0; i<5; i++) {
					if(set.contains(str.charAt(i))) {
						set.remove(str.charAt(i));
					} else {
						System.out.println("NO");
						break;
					}
				}
				if(set.size() == 0) {
					System.out.println("YES");
				}
				
			}
			
		}
	}

}
