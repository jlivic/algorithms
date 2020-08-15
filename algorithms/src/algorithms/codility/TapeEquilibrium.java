package algorithms.codility;

import java.util.Arrays;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class TapeEquilibrium {

	public static int solution(int[] A) {

		int smallestDifference = Integer.MAX_VALUE;

		int[] sumArray = new int[A.length];

		for (int i = 0; i < A.length; i++) {

			if (i > 0)
				sumArray[i] = sumArray[i - 1] + A[i];
			else
				sumArray[i] = A[i];

		}

		for (int j = 0; j < sumArray.length - 1; j++) {

			int secondHalf = sumArray[sumArray.length - 1] - sumArray[j];

			int splitNum = Math.abs(sumArray[j] - secondHalf);

			if (splitNum < smallestDifference)
				smallestDifference = splitNum;

		}

		return smallestDifference;
	}
}
