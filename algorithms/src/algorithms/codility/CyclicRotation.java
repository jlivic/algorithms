package algorithms.codility;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CyclicRotation {

	@Test
	public void testCyclicRotationSolution() {
		
		int[] A = {3, 8, 9, 7, 6};
		int[] resultA = {9, 7, 6, 3, 8};
		assertArrayEquals(resultA, CyclicRotation.solution(A, 3));
		
		int[] B = {0, 0, 0};
		int[] resultB = {0, 0, 0};
		assertArrayEquals(resultB, CyclicRotation.solution(B, 1));
		
		int[] C = {1, 2, 3, 4};
		int[] resultC = {1, 2, 3, 4};
		assertArrayEquals(resultC, CyclicRotation.solution(C, 4));
	}
	
	public static int[] solution(int[] A, int K) {
		// Create a second array 
        int [] rotated_A = new int[A.length];
        // number of elements in A
        int N = A.length;
        if (N == 0 || N == 1 || K % N == 0) {
        	return A;
        }
        else {
        	if (K > N) {
        		K = K % N;
        	}
        	for (int i = 0; i < N; i++) {
        		if (N - K + i < N) {
        			rotated_A[i] = A[N - K + i];
        		}
        		else {
        			rotated_A[i] = A[i - K];
        		}
        		
        		
        	}
        	return rotated_A;        	
        }
    }
}
