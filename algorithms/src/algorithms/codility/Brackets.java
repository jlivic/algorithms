package algorithms.codility;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class Brackets {

	@Test
	public void testBracketsSolution() {

		String s = "{[()()]}";
		assertEquals(Brackets.solution(s), 1);
	}

	public static int solution(String S) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < S.length(); i++) {

			char curr = S.charAt(i);
			if (isOpeningBracket(curr)) {
				stack.push(curr);
			} else {

				if (stack.size() == 0) {
					return 0;
				}

				char poped = stack.pop();
				if (isBracketMatch(poped, curr)) {
					continue;
				} else {
					return 0;
				}

			}

		}

		if (stack.isEmpty())
			return 1;

		return 0;
	}

	static boolean isOpeningBracket(char oBracket) {
		if (oBracket == '[' || oBracket == '(' || oBracket == '{') {
			return true;
		}
		return false;
	}

	static boolean isBracketMatch(char oBracket, char cBracket) {
		if (oBracket == '[' && cBracket == ']')
			return true;
		if (oBracket == '(' && cBracket == ')')
			return true;
		if (oBracket == '{' && cBracket == '}')
			return true;

		return false;
	}
}
