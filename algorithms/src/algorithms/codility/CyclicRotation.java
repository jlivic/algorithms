package algorithms.codility;

public class CyclicRotation {

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
