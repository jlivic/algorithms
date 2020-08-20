package algorithms.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSliceSum {

	@Test
	public void testMaxSliceSumSolution() {
		int[] A = {3, 2, -6, 4, 0};
		assertEquals(5, MaxSliceSum.solution(A));
	}
	
	
	public static int solution(int[] A) {
		
		int currentMax = A[0];
		int globalMax = A[0];
		
		for (int i = 1; i < A.length; i++) {
			
			currentMax = Math.max(A[i], currentMax + A[i]);
			
			if (currentMax > globalMax) {
				globalMax = currentMax;
			}
			
		}
		
		return globalMax;
	}
}
