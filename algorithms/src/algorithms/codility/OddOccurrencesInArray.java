package algorithms.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OddOccurrencesInArray {

	@Test
	public void testOddOccurrencesInArraySolution() {

		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		assertEquals(7, OddOccurrencesInArray.solution(A));
	}

	public static int solution(int[] A) {

		int oddOc = 0;
		for (int i = 0; i < A.length; i++) {
			oddOc ^= A[i];
		}

		return oddOc;

	}
}