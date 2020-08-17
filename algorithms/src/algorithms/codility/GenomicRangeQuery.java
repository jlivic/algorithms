package algorithms.codility;

public class GenomicRangeQuery {
	
	/**
	 * 
	 * @param S - DNA combination
	 * @param P 
	 * @param Q
	 * @return
	 */
	public static int[] solution(String S, int[] P, int[] Q) {
		
		int[][] prefixSum = new int[3][S.length()];
		short a, c, g;
		for (int i = 0; i < S.length(); i++) {
			a = 0; 
			c = 0; 
			g = 0;
			
			if('A' == S.charAt(i)) {
				a = 1;
			}
			if('C' == S.charAt(i)) {
				c = 1;
			}
			if('G' == S.charAt(i)) {
				g = 1;
			}
			
			prefixSum[0][i + 1] = prefixSum[0][i] + a;
			prefixSum[1][i + 1] = prefixSum[0][i] + c;
			prefixSum[2][i + 1] = prefixSum[0][i] + g;
		}	
		
		int[] result = new int[P.length];
		
		for(int j = 0; j < P.length; j++) {
			int fromIndex = P[j];
			int toIndex = Q[j] + 1;
			
			if(prefixSum[0][toIndex] - prefixSum[0][fromIndex] > 0) {
				result[j] = 1;
			}
			else if(prefixSum[1][toIndex] - prefixSum[1][fromIndex] > 0) {
				result[j] = 2;
			}
			else if(prefixSum[2][toIndex] - prefixSum[2][fromIndex] > 0) {
				result[j] = 3;
			}else {
				result[j] = 4;//T
			}
		}
		
		return result;
	}
}
