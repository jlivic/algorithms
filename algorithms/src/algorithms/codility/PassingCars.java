package algorithms.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PassingCars {

	@Test
	public void testPassingCarsSolution() {
		int[] A = { 0, 1, 0, 1, 1 };
		assertEquals(PassingCars.solution(A), 5);
	}

	public static int solution(int[] A) {

		int countOfZeros = 0, count = 0;
		for (int i = 0; i < A.length; i++) {

			if (A[i] == 0)
				countOfZeros++;
			if (A[i] == 1)
				count += countOfZeros;
			if (count > 1000000000)
				return -1;
		}

		return count;
	}
}
