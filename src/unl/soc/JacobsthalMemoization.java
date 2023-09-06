package unl.soc;

/**
 * This program computes the n-th Jacobsthal number using recursion. It also
 * reports how long the program takes to execute.
 *
 */
public class JacobsthalMemoization {

	/**
	 * Computes the n-th Jacobsthal number using an iterative method
	 */
	public static long jacobsthalIterative(int n) {
		if (n <= 1) {
			return n;
		}
		long prev = 0;
		long curr = 1;
		for (int i = 2; i <= n; i++) {
			long t = 2 * prev + curr;
			prev = curr;
			curr = t;
		}
		return curr;
	}

	// TODO: place your method and documentation here
	// Hint: it should return long (integer)
	// it should take a cache (List<Long> or Map<Integer, Long>) as well

	public static void main(String args[]) {

		if (args.length != 1) {
			System.err.println("Usage: n [integer}]");
			System.exit(1);
		}
		int n = Integer.parseInt(args[0]);

		// TODO: set up our cache here to compute values J(0) to J(n) inclusive

		// TODO: initialize the cache values: take care of the base cases

		long iterativeResult = jacobsthalIterative(n);
		// TODO: call your function here

		long memoizationResult = 0;

		long start = System.currentTimeMillis();

		long end = System.currentTimeMillis();

		double time = (end - start) / 1000.0;

		System.out.printf("Iterative:   Jacobsthal(%d) = %d\n", n, iterativeResult);
		System.out.printf("Memoization: Jacobsthal(%d) = %d\n", n, memoizationResult);

		System.out.printf("Total Computation Time: %f seconds\n", time);

	}

}
