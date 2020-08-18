package algorithms.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MaxProductOfThree {

	
	@Test
	public void testMaxProductOfThree() {
		int[] A = {-3, 1, 2, -2, 5, 6};
		assertEquals(MaxProductOfThree.solution(A), 60);
	}
	
	public static int solution(int[] A) {
		
		Arrays.sort(A);
		
		int biggest = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
		int smallest = A[0] * A[1] * A[A.length-1];
		
		return biggest > smallest ? biggest : smallest;
	}
}
