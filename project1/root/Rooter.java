package root;

/*
 * The Rooter class able to calculate the square root
 * of a number with a specified precision using an iterative approach.
 */

public class Rooter {
	private double precision;

	public Rooter(double precision) {
		this.precision = precision;
	}

	public void setPrecision(double precision) {
		this.precision = precision;
	}

	// Method to calculate the square root of a number with the specified precision
	public double sqrt(double x) {
		// Step 1: Initialize one and two
		double one = 1;
		double two = x;

		// Step 2, 3, 4, 5: Iteratively update one and two until the difference is
		// within precision
		while (Math.abs(two - one) >= precision) {
			one = (one + two) / 2;
			two = (x / one);
			if (one == two) { // Exact root found
				return one;
			}
		}
		// difference is within precision, we can return one or two.
		return one;
	}

}
