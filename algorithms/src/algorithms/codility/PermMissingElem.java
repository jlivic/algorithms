package algorithms.codility;

import java.util.Arrays;

public class PermMissingElem {

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
