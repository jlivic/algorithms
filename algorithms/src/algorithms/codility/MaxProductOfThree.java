package algorithms.codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MaxProductOfThree {

	@Test
	public void testMaxProductOfThreeSolution() {
		
		int[] A = {-3, 1, 2, -2, 5, 6};
		assertEquals(MaxProductOfThree.solution(A), 60);
	}
	
	public static int solution(int[] A) {
		
		Arrays.sort(A);
		
		int max = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
		int min = A[0] * A[1] * A[A.length-1];
		
		return Math.max(min, max);
	}
}
