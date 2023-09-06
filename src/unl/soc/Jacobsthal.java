package unl.soc;

public class Jacobsthal {

	public static void main(String args[]) {

		if (args.length != 1) {
			System.err.println("Usage: n [integer]");
			System.exit(1);
		}
		int n = Integer.parseInt(args[0]);

		long start = System.currentTimeMillis();

		// TODO: call your function here
		long result = 0;

		long end = System.currentTimeMillis();

		double time = (end - start) / 1000.0;

		System.out.printf("Jacobsthal(%d) = %d\n", n, result);

		System.out.printf("Computation Time: %.2f seconds\n", time);

	}

	// TODO: write your recursive Jacobsthal function here

}
