package algorithms.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryGap {

	@Test
	public void testBinaryGapSolution() {
		int a = 1041;
		assertEquals(BinaryGap.Solution(a), 5);

		int b = 15;
		assertEquals(BinaryGap.Solution(b), 0);

		int c = 32;
		assertEquals(BinaryGap.Solution(c), 0);
	}

	public static int Solution(int N) {
		
		int gap = 0;
		int tempGap = 0;
		String s = Integer.toBinaryString(N);
		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {

			if (c[i] == '0') {
				tempGap++;
			} else {

				if (gap < tempGap) {
					gap = tempGap;
				}

				tempGap = 0;

			}

		}

		return gap;
	}
}
