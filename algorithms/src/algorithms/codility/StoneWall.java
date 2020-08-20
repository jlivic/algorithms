package algorithms.codility;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class StoneWall {

	@Test
	public void testStoneWallSolution() {
		int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};
		assertEquals(StoneWall.solution(H), 7);
	}
	
	public static  int solution(int[] H) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(H[0]);
		int count = 1;
		int n = H.length;
		
		for (int i = 1; i < n; i++) {
			
			if(H[i] == stack.peek()) {
				continue;
			}else if(H[i] > stack.peek()) {
				stack.push(H[i]);
				count++;
			}else {
				
				while(!stack.isEmpty() && H[i] < stack.peek()) {
					stack.pop();
				}
				
			}
			
			if(!stack.isEmpty() && H[i] == stack.peek()) {
				continue;
			}
			
			stack.push(H[i]);
			count++;
			
		}
		
		return count;
		
	}
}
