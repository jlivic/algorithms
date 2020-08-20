package algorithms.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MaxProfit {

	@Test
	public void testMaxProfitsolution() {
		int[] A = { 23171, 21011, 21123, 21366, 21013, 21367 };
		assertEquals(356, MaxProfit.solution(A));
	}

	public static int solution(int[] A) {
		if (A.length == 0)
			return 0;
		
		int min = A[0]; // mainin the previous min price
		int profit = 0; // current max profit
		
		for (int i = 1; i < A.length; i++) {
			min = Math.min(min, A[i]); // update minimum
			profit = Math.max(profit, A[i] - min); // calculate current profit
		}
		
		return profit > 0 ? profit : 0;
	}

}
