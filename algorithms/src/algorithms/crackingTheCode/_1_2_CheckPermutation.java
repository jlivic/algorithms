package algorithms.crackingTheCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class _1_2_CheckPermutation {
	
	@Test
	public void testPerm() {
		assertEquals(true, isPermutation("test", "tset"));
		assertEquals(false, isPermutation("test", "developer"));
		assertEquals(true, isPermutation("topot", "topot"));
	}
	
	private boolean isPermutation(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		HashMap<Character, Integer> charCounter = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s1.length(); i++) {
			
			if(charCounter.get(s1.charAt(i)) == null) {
				charCounter.put(s1.charAt(i), 0);
			}
			
			int counter = charCounter.get(s1.charAt(i));
			charCounter.put(s1.charAt(i), ++counter);
			
		}
		
		for (int i = 0; i < s2.length(); i++) {
			
			if(charCounter.get(s2.charAt(i)) == null || charCounter.get(s2.charAt(i)) < 0) {
				return false;
			}
			
			int counter = charCounter.get(s2.charAt(i));
			charCounter.put(s2.charAt(i), --counter);
			
		}
		
		for (char character : charCounter.keySet()) {
			
			if(charCounter.get(character) != 0) {
				return false;
			}
			
		}
		
		return true;
	}
}
