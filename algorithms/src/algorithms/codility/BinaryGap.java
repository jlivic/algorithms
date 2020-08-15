package algorithms.codility;

public class BinaryGap {

	public static int Solution(int n) {
		int result = 0;
		int tempGap = 0;
		String s = Integer.toBinaryString(n);
		char[] c = s.toCharArray();
		System.out.println(s);
		for (int i = 0; i < c.length; i++) {

			if (c[i] == '0') {
				tempGap += 1;
				//System.out.println(tempGap);
			} else {

				if (result < tempGap) {
					result = tempGap;
					 
				}
				
				tempGap = 0;
			}

		}

		return result;
	}
}
