package program18_11_21;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ValidParentheses {

	public static boolean validParentheses(String parens) {

		try {
			Pattern.compile(parens.replaceAll("[^()]", ""));
			return true;
		}

		catch (PatternSyntaxException e) {
			return false;
		}

	}

	public static boolean validParentheses1(String parens) {

		int count = 0;

		for (int i = 0; i < parens.length(); i++) {

			if (parens.charAt(i) == '(')
				count++;
			else if (parens.charAt(i) == ')')
				count--;
		}

		return count == 0 ? true : false;
	}

	public static void main(String[] args) {

		validParentheses(null);
	}

}
