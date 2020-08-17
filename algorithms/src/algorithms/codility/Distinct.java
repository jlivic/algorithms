package algorithms.codility;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Distinct {

	@Test
	public void DistinctSolution() {
		int[] A = {2, 1, 1, 2, 3, 1};
		assertEquals(Distinct.solution(A), 3);
	}
	
	public static int solution(int[] A) {
		
		Set<Integer> values = new HashSet<>();
		
		for (int i = 0; i < A.length; i++) {
			
			if(!values.contains(A[i]))
				values.add(A[i]);
		
		}
		
		return values.size();
	}
}
