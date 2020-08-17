package algorithms.hakkerrank.certification;

public class VowelSubstring {
	
	/**
	 * Given a string of lowecse English letters and an integer ofthe substring length, 
	 * determine the substring of that lenth that contains the most vowels. Vowels are
	 * in the set {a, e, i, o, u}. If there si more than one substring with the maximm
	 * number of vowels, return the one that starts at the lowest index. If there are 
	 * no vowels in the input string, return the string 'Not found!', without quotes.
	 * 
	 * Example 1:
	 * s = 'caberqiitefg'
	 * k = 5
	 * The substring of length k = 5 that contains the maximum number of vowels is 'erqii' with 3
	 * vowels. 
	 * The final answer is 'erqii'
	 * 
	 * Example 2:
	 * s = 'aeiouia'
	 * k = 3
	 * All of the characters are vowels, so any substring of length 3 will have 3 vowels. The lowest
	 * index substring is at index 0 'aei'
	 * 
	 * Function description:
	 * Complete the function findSubstring in the eitor below.
	 * findSubstring has the folowing parameters:
	 * @param s - a string
	 * @param k - an integer
	 * @return string containing the final answer
	 * <a>
	 * Constraints:
	 * 	<l> 1 <= 2 * 10*5
	 *  <l> 1 <= k <= length(s)
	 *  
	 *  Test case: 
	 *  s = 'azerdii'
	 *  k = 5
	 */
	public static String findSubstring(String s, int k) {
		String tempWord = "";//will be filled when result come
		int tempVowelCount = 0;//for each function call reset to 0.
		
		char[] c = s.toCharArray();
		if(c.length >= 5) {
			
			for(int i = 0; i < k; i++) {
				tempWord = tempWord + c[i];
				boolean b = isVowel(c[i]);
				
				if(b == true) {
					tempVowelCount += 1;
				}
				
			}
			
			if (vowelCount < tempVowelCount) {
				vowelCount = tempVowelCount;
				result = tempWord;
			}
			
			findSubstring(s.substring(1), k);

			if(vowelCount == 0) {
				result = "Not found!";
			}
		}
		return result;
	}
	
	private static int vowelCount;
	private static String result = "";//will be filled when result come

	private static boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}
}
