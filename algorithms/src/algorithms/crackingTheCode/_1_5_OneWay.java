package algorithms.crackingTheCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _1_5_OneWay {

	@Test
	public void testOneWay() {
		
		assertEquals(true, oneWayEdits("pale", "ple"));
		assertEquals(true, oneWayEdits("pales", "pale"));
		assertEquals(true, oneWayEdits("pale", "bale"));
		assertEquals(false, oneWayEdits("pale", "bake"));
		
	}
	
	private boolean oneWayEdits(String s1, String s2) {
		
		//Check if length is greater than 1
		if(Math.abs(s1.length() - s2.length()) > 1) {
			return false;
		}
		
		//get shorter and longer String
		String first = s1.length() < s2.length() ? s1 : s2;
		String second =s1.length() < s2.length() ? s2 : s1;
		
		int index1 = 0;
		int index2 = 0;
		boolean foundDifference = false;
		while(index2 < second.length() && index1 < first.length()) {
			if(first.charAt(index1) != second.charAt(index2)) {
				//ensure that this is the first difference found
				if(foundDifference) {
					return false;
				}
				
				foundDifference = true;
				
				if(first.length() == second.length()) {
					//on replace move shorter pointer
					index1++;
				}
			}else {
				index1++; //if matching, move shorter pointer
			}
			
			index2++; //always move pointer for longer string
		}
		
		return true;
	}
}
