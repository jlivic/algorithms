package algorithms.hakkerrank;

/**
 * Observe that its base and height are both equal to , and the image is drawn
 * using # symbols and spaces. The last line is not preceded by any spaces.
 * 
 * Write a program that prints a staircase of size .
 * 
 * Function Description
 * 
 * Complete the staircase function in the editor below. It should print a
 * staircase as described above.
 * 
 * staircase has the following parameter(s):
 * 
 * n: an integer Input Format
 * 
 * A single integer, , denoting the size of the staircase.
 * 
 * Constraints
 * 
 * .
 * 
 * Output Format
 * 
 * Print a staircase of size using # symbols and spaces.
 * 
 * Note: The last line must have spaces in it.
 * 
 * Sample Input
 * 
 * 6 Sample Output
 * 
 * # 
 * ## 
 * ### 
 * #### 
 * ##### 
 * ######
 * 
 * @author jlivic
 *
 */
public class Staircase {
	
	public static void staircase(int n) {
		String result = padRight(" ", n - 1 );
		for(int i = 0; i < n; i++) {
			
			result += "#";
			System.out.println(result);
			result = result.substring(1);
			
		}
	}
	
	private static String padRight(String s, int n) {
	     return String.format("%-" + n + "s", s);  
	}

	private static String padLeft(String s, int n) {
	    return String.format("%" + n + "s", s);  
	}
}
