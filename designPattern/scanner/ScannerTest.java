package designPattern.scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ScannerTest {

	public static class FastReader {

		public BufferedReader bf = null;
		public StringTokenizer stringTokenizer;

		public FastReader() {
			bf = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			if (stringTokenizer == null || stringTokenizer.hasMoreTokens()) {
				try {
					stringTokenizer = new StringTokenizer(bf.readLine());
				}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			return stringTokenizer.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		Long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = bf.readLine();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return str;
		}

	}
	 public static void main(String[] args)
	    {
		 
		 
		 int inarr1[] = {1, 2, 3};
	      int inarr2[] = {1, 2, 3}; 
	      Object[] arr1 = {inarr1};  // arr1 contains only one element
	      Object[] arr2 = {inarr2};  // arr2 also contains only one element
	      Object[] outarr1 = {arr1}; // outarr1 contains only one element
	      Object[] outarr2 = {arr2}; // outarr2 also contains only one element        
	      if (Arrays.deepEquals(outarr1, outarr2))
	          System.out.println("Same");
	      else
	          System.out.println("Not same");
		 
		 
//	        FastReader s=new FastReader();
//	        int n = s.nextInt();
//	        int k = s.nextInt();
//	        int count = 0;
//	        while (n-- > 0)
//	        {
//	            int x = s.nextInt();
//	            if (x%k == 0)
//	               count++;
//	        }
//	        System.out.println(count);
	    }

}
