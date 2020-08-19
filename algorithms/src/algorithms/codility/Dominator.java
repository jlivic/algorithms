package algorithms.codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Dominator {

	@Test
	public void testDominatorSolution() {

		// int[] A = { 3, 4, 3, 2, 3, -1, 3, 3 };
		int[] A = { 100, 100, 100, 100 };
		assertEquals(Dominator.solution(A), 3);

	}

	public static int solution(int[] A) {

		int candidate = 0;
		int counter = 0;

		// Find candidate for leader
		for (int i = 0; i < A.length; i++) {

			if (counter == 0)
				candidate = i;

			if (A[i] == A[candidate]) {
				counter++;
			} else {
				counter--;
			}
		}

		// Count candidate occurrences in array
		counter = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == A[candidate])
				counter++;
		}

		// Check that candidate occurs more than array.lenght/2
		return counter > A.length / 2 ? candidate : -1;
	}
}
