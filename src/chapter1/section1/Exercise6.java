package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Rene Argento
 */
public class Exercise6 {
	// note this is a fast iterative way to get fibonacci sequence 
	// requiring only two operations per iterations
	// this method returns the Nth fib sequence
	public static long IterativeFib(int N)
	{
		long f = 0, g = 1;
		for (long i = 0; i < N; i++)
		{
			f = f + g;
			g = f - g;
		}
		return f;
	}
	
	public static void main(String[] args) {
		int f = 0;
		int g = 1;
		
		for (int i = 0; i <= 15; i++) {
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}
	
}
