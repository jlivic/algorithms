package algorithms.crackingTheCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class _1_1_IsUnique {

	@Test
	public void testIsUnique() {
		assertEquals(false, isUnique("test"));
		assertEquals(false, isUnique("isUnique"));
		assertEquals(true, isUnique("abcdef"));
	}
	
	private boolean isUnique(String s) {
		
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
			}else {
				return false;
			}
		}
		
		return true;
	}
}
