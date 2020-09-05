package algorithms.crackingTheCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _1_3_URLify {

	
	@Test
	public void testUrlify() {
		assertEquals("Mr%20John%20Smith", urlify("Mr John Smith", 13));
		assertEquals("Lucas%20Barzan", urlify("Lucas Barzan  ", 12));
		assertEquals("Cracking%20the%20Coding%20Interview", urlify("Cracking the Coding Interview      ", 29));
	}
	
	private String urlify(String s, int l) {

		return s.trim().replaceAll(" ", "%20");
	}
}
