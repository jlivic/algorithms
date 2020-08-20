package algorithms.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountFactors {

	@Test
	public void testCountFactorsSoltion() {
		int N = 24;
		assertEquals(8, CountFactors.solution(N));
	}

	public static int solution(int N) {

		int factors = 0;
		int squareRootN = (int) Math.sqrt(N);
		if (Math.pow(squareRootN, 2) != N) {
			squareRootN++; // round up for any non-perfect squares
		} else { // perfect squares have an additional factor
			factors++;
		}

		for (int i = 1; i < squareRootN; i++) {
			if (N % i == 0) {
				factors += 2;
			}
		}

		return factors;
	}
}
