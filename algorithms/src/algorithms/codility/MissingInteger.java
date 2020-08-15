package algorithms.codility;

import java.util.Arrays;

public class MissingInteger {

	public static int solution(int[] A) {
		
		
		if (A.length == 0) {
			return -1;
		}
		
		Arrays.sort(A);
		int missing = 1;
		if(A[0] > 1)
			return 1;
		
		for (int i = 0; i < A.length; i++) {
			
			if (A[i] == missing) {
				missing = A[i] + 1;
			}
			
		}
		
		return missing;
	}
}
