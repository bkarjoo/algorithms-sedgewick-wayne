package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Rene Argento
 */
public class Exercise14 {

	public static void main(String[] args) {
		StdOut.print(lg(15));
		StdOut.println("\nExpected: 3");
	}

	private static int lg(int n) {
		
		int logInt = 0;
		
		while (n > 0) {
			logInt++;
			
			n /= 2;
		}
		
		return logInt - 1;
	}
	
	// bottom up reaches the result 1 or 2 iterations faster
	public static int lg2(int N)
	{
		int log = 1, power = 2;
		while (power < N) {
			power *= 2; 
			log++;
		}
		return power > N ? log - 1 : log;
	}
	
}
