package algorithms.codility;

public class FrogJmp {

	public static int solution(int X, int Y, int D) {
		
		return (int) Math.ceil( (Y-X) / (double)D );
	}
}
