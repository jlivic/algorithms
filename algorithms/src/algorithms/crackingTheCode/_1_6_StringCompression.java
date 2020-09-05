package algorithms.crackingTheCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _1_6_StringCompression {

	
	@Test
	public void testCompressed() {
		assertEquals("a2b1c5a3", compressed("aabcccccaaa"));
	}
	
	private String compressed(String s) {
		String compressedString = "";
		int counter = 0;
		
		for(int i = 0; i < s.length(); i++) {
			counter++;
		
			if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
				compressedString += "" + s.charAt(i) + counter;
				counter = 0;
			}
		}
			
		return compressedString.length() < s.length() ? compressedString : s;
	}
}
