package algorithms.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinAvgTwoSlice {

	
	@Test
	public void testMinAvgTwoSliceSolution() {
		
		int[] A = {4, 2, 2, 5, 1, 5, 8};
		assertEquals(MinAvgTwoSlice.solution(A), 1);
	}
	
	public static int solution(int[] A) {

		if (A.length < 2) {
			return 0;
		}

		int minSliceTwo = A[0] + A[1];
		int twoIx = 0;

		int minSliceThree = Integer.MAX_VALUE;
		int threeIx = 0;

		for (int i = 2; i < A.length; i++) {

			int sliceTwo = A[i - 1] + A[i];

			if (sliceTwo < minSliceTwo) {
				minSliceTwo = sliceTwo;
				twoIx = i - 1;
			}

			int sliceThree = sliceTwo + A[i - 2];

			if (sliceThree < minSliceThree) {
				minSliceThree = sliceThree;
				threeIx = i - 2;
			}
		}

		int averageMinTwo = minSliceTwo * 3;
		int averageMinThree = minSliceThree * 2;

		if (averageMinTwo == averageMinThree)
			return Math.min(twoIx, threeIx);
		else
			return averageMinTwo < averageMinThree ? twoIx : threeIx;
	}

}
