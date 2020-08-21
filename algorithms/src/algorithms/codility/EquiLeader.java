package algorithms.codility;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EquiLeader {
	
	public void testEquiLeaderSolution() {
		
		int[] A = {4, 3, 4, 4, 4, 2};
		assertEquals(2, EquiLeader.solution(A));
		
	}
	public static int solution(int[] A) {
		HashMap< Integer,Integer> hm = new HashMap();
        for( int i: A)
        {
            if(hm.containsKey(i))
                hm.put(i,hm.get(i)+1);
            else
                 hm.put(i,1);
        }
        int maxNum=0;
        int maxCount=0;
        for(int j: hm.keySet())
        {
            int currentCount=hm.get(j);
            if(maxCount< currentCount)
            {
                maxCount=currentCount;
                maxNum=j;
            }
        }
        
        int countOfMax=maxCount;
        int firstPart=0;
        int equiLeader=0;
        for(int i =0;i< A.length-1;i++)
        {
            if(A[i]==maxNum)
            {
                countOfMax--;
                firstPart++;
            }
          
            if((A.length-(i+1))/2< countOfMax&&(i+1)/2< firstPart)
            {
                equiLeader++;
            }
        }
        return equiLeader;
    }
}
