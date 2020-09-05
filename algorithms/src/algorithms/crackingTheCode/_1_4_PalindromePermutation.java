package algorithms.crackingTheCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class _1_4_PalindromePermutation {

	@Test
	public void testIsPalindromePermutation() {
		assertEquals(true, isPalindromePermutation("taco cat"));
		assertEquals(true, isPalindromePermutation("jankoooooo"));
	}
	
	private boolean isPalindromePermutation(String s) {
		
		   HashMap<Character,Integer> hashMap = new HashMap<>();

	        for(Character c :s.toCharArray()) {
	            Integer a = hashMap.get(s);

	            if (a == null) {
	                hashMap.put(c, 1);
	            } else {
	                a++;
	                hashMap.put(c, a);
	            }
	        }

	        int count=0;
	        for(Integer i:hashMap.values()){
	            count+=i%2;
	        }
	        
		return count >= 1;
	}
}
