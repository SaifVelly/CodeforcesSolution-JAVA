package probs;


import java.util.Scanner;
public class A1829 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String codeforces = "codeforces";
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String str = sc.nextLine();
			int res =0;
			for(int i=0 ; i<10 ; i++) {
				if(str.charAt(i)!=codeforces.charAt(i)) {
					res++;
				}
			}
			System.out.println(res);
		}
		
	}

}
