package algorithms.codility;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class Nesting {

	@Test
	public void testNestingSolution() {
		String s = "(()(())())";
		assertEquals(Nesting.solution(s), 1);
	}

	public static int solution(String S) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < S.length(); i++) {

			char curr = S.charAt(i);
			if (isBraceOpen(curr)) {

				stack.push(curr);

			} else {

				if (stack.size() == 0) {
					return 0;
				}

				char popped = stack.pop();
				if (isBracketMatch(curr, popped)) {
					continue;
				} else {
					return 0;
				}

			}

		}

		if (stack.isEmpty()) {
			return 1;
		}

		return 0;
	}

	private static boolean isBraceOpen(char oBracket) {

		if (oBracket == '{' || oBracket == '[' || oBracket == '(')
			return true;

		return false;
	}

	private static boolean isBracketMatch(char oBracket, char cBracket) {

		if (oBracket == '{' && cBracket == '}' || oBracket == '}' && cBracket == '{')
			return true;
		if (oBracket == '(' && cBracket == ')' || oBracket == ')' && cBracket == '(')
			return true;
		if (oBracket == '[' && cBracket == ']' || oBracket == ']' && cBracket == '[')
			return true;

		return false;
	}
}
