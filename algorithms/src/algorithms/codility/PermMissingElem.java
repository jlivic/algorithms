package algorithms.codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PermMissingElem {

	@Test
	public void testPermMissingElemSolution() {
		int[] A = { 2, 3, 1, 5 };
		assertEquals(4, PermMissingElem.solution(A));
	}
	
	public static int solution(int[] A) {

		int missing = 1;

		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			
			if (A[i] == missing) {
				missing = A[i] + 1;
			}
		}

		return missing;

	}
}
