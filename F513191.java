package probs;
import java.util.*;
public class F513191 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		int[] nums=new int[n];
		ArrayList<Integer> visited=new ArrayList<>();

		for(int i=0;i<n;i++) {
			nums[i]=scanner.nextInt();
			visited.add(-1);

		}
		int res=0;
		for(int i=0;i<n;i++) {
			if(visited.get(i)==-1) {
				dfs(i,nums,visited);
				res++;
			}
		}
		System.out.println(res);
		
	}
	public static void dfs(int n,int[] nums ,ArrayList<Integer> visited) {
		visited.set(n,1);
		if(visited.get(nums[n]-1)==-1) {
			dfs(nums[n]-1,nums,visited);
		}
		return;

	}

}
