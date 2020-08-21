package algorithms.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrogJmp {
	
	@Test
	public void testFrogJpmSolution() {
		int X = 10;
		int Y = 85;
		int D = 30;
		
		assertEquals(3, FrogJmp.solution(X, Y, D));
	}
	
	public static int solution(int X, int Y, int D) {
		
		System.out.println((int) Math.ceil( (Y-X) / (double)D ));
		
		return (int) Math.ceil( (Y-X) / (double)D );
	}
}
