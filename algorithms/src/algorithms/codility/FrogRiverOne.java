package algorithms.codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	
	public static int solution(int X, int[] A) {
		
		Set<Integer> s = new HashSet<>();
	    for (int n = 1; n <= X; n++) {
	      s.add(n);
	    }

	    for (int i = 0; i < A.length; i++) {
	      int n = A[i];
	      if (s.contains(n)) {
	        s.remove(n);
	        if (s.isEmpty()) {
	          return i;
	        }
	      }
	    }

	    return -1;
	}
}
