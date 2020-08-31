package algorithms.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSums {

	
	@Test
	public void testTwoSums() {
		
		int[] a = {2,7,11,15};
		int ta = 9;
		int[] ra = {0, 1};
		assertArrayEquals(ra, TwoSums.twoSum(a, ta));
		
		int[] b = {3,2,4};
		int tb = 6;
		int[] rb = {1,2};
		assertArrayEquals(rb, TwoSums.twoSum(b, tb));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[nums.length];
		
		for (int i = 1; i < nums.length; i++) {
			
			if(nums[i - 1] + nums[i] == target) {
				result[0] = nums[i - 1];
				result[1] = nums[i];
				
				System.out.println(result[0]);
				System.out.println(result[1]);
				
				return result;
			}
				
			
		}
		
		return result;
	}
}
