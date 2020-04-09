package unl.cse.recursion;

import java.util.Arrays;

public class Fibonacci {
	
	private static int[] intArray = new int [50];

	public int fibonacci(int n) {
		if (n == 0) {
			intArray[n]++;
			return 0;
		} else if (n == 1) {
			intArray[n]++;
			return 1;
		} else {
			intArray[n]++;
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String args[]) {
		
		

		Fibonacci f = new Fibonacci();
		int result, n = 45;

		long start, end;
		start = System.nanoTime();
		result = f.fibonacci(n);
		end = System.nanoTime();

		double ms = (end - start) / 1000000.0;

		System.out.println("fibonacci(" + n + ") = " + result);
		System.out.println("execution time = " + ms + "ms");
		
		System.out.println("Fibonacci Repeats: " + Arrays.toString(intArray));

	}
}
