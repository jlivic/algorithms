package algorithms.codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MissingInteger {

	@Test
	public void testMissingIntegerSolution() {
		int[] A = { 2, 3, 1, 5 };
		assertEquals(4, MissingInteger.solution(A));
	}

	public static int solution(int[] A) {

		if (A.length == 0) {
			return -1;
		}

		Arrays.sort(A);
		int missing = 1;
		if (A[0] > 1)
			return 1;

		for (int i = 0; i < A.length; i++) {

			if (A[i] == missing) {
				missing = A[i] + 1;
			}

		}

		return missing;
	}
}
