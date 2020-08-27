package algorithms.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MinPerimeterRectangle {

	@Test
	public void testMinPerRecSolution() {

		assertEquals(22, MinPerimeterRectangle.solution(30));
		assertEquals(40, MinPerimeterRectangle.solution(100));
	}

	public static int solution(int N) {

		int squareRootN = (int) Math.sqrt(N);
		int minPerimeter = Integer.MAX_VALUE;

		if (Math.pow(squareRootN, 2) != N) {
			squareRootN++; // round up for any non-perfect squares
		} else { // perfect square root won't be reached inside loop so calculate and set min
					// perimeter
			minPerimeter = 2 * (squareRootN + squareRootN);
		}

		for (int i = 1; i < squareRootN; i++) {
			if (N % i == 0) {
				int temp = 2 * (i + (N / i));

				minPerimeter = Math.min(temp, minPerimeter);
			}
		}

		return minPerimeter;
	}
}
