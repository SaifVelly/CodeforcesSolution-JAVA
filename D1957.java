package probs;

    import java.util.*;
    import java.io.*;
     
    public class D1957 {
        public static void main(String[] args) {
            FastReader scanner = new FastReader();            
            int t = scanner.nextInt();            
            while (t-- > 0) {
                int n = scanner.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }

                System.out.println(countTuples(arr));
                
            }
        }
     
        private static boolean AllOnes(int[] arr) {
        	 for (int i = 0; i < arr.length; i++) {
                 if(arr[i]!=1) {
                	 return false;
                 }
             }
			return true;
		}

		private static boolean AllZeros(int[] arr) {
       	 for (int i = 0; i < arr.length; i++) {
             if(arr[i]!=0) {
            	 return false;
             }
         }
		return true;
	}

		static int countTuples(int[] arr) {
            int count = 0;
            int n = arr.length;
            for (int x = 0; x < n; x++) {
                for (int y = x; y < n; y++) {
                    for (int z = y; z < n; z++) {
                        int fx = calculateF(arr, x, y);
                        int fy = calculateF(arr, y, z);
                        int fz = calculateF(arr, x, z);
                        if ((fx ^ fy) > fz) {
                            count++;
                        }
                    }
                }
            }
            return count;
        }
     
        static int calculateF(int[] arr, int l, int r) {
            int result = 0;
            for (int i = l; i <= r; i++) {
                result ^= arr[i];
            }
            return result;
        }
        static class FastReader {
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
        }}
    
    