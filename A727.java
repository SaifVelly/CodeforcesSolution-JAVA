package probs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A727 {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        
            boolean T = true;
            int a = fs.nextInt();
            int b = fs.nextInt();
            List<Integer> list = new ArrayList<>();
            list.add(b);
            if (b == 1000000000 && a == 1) {
                System.out.println("NO");
            } else {
            	while(a < b) {
            	    if (b % 10 == 1) {
            	        b = b / 10;
            	        list.add(b);
            	    } else if (b % 2 == 0) {
            	        b = b / 2;
            	        list.add(b);
            	    } else {
            	        T = false;
            	        break;
            	    }
            	}

                if (b == a) {
                    System.out.println("YES");
                    System.out.println(list.size());
                    printInverse(list);
                }
                else {
                	System.out.println("NO");
                }
            }
        
    }

    private static void printInverse(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(list.size() - 1 - i) + " ");
        }
        System.out.println(list.get(0));
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
