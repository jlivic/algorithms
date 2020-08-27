package algorithms.codility;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {

    public static int solution(int[] A) {
        
        Set<Integer> set = new HashSet<Integer>();
    
        for(int i = 0; i < A.length; i++){
            
            int tmp = Math.abs(A[i]);
            if(!set.contains(tmp))
                set.add(tmp);
        }
        
        
        return set.size();
    }
}
