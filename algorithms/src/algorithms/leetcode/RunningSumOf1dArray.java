package algorithms.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RunningSumOf1dArray {

	@Test
	public void testRunningSumOf1dArray() {
		
		int[] nums = {1, 2, 3, 4};
		int[] result = {1,3,6,10};
		assertArrayEquals(result, RunningSumOf1dArray.runningSum(nums));
	}
	
    public static int[] runningSum(int[] nums) {
    	int[] result = new int[nums.length];
    	int sums = 0;
    	
    	for (int i = 0; i < result.length; i++) {
			sums +=  nums[i];
			result[i] = sums;
		}
        
        return result;
    }
}
