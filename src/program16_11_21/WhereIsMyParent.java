package program16_11_21;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WhereIsMyParent {

	static String findChildren(String text) {

		String str = Arrays.stream(text.toLowerCase().split("")).sorted()

				.collect(Collectors.joining());

		String result = String.valueOf(str.charAt(0)).toUpperCase();

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i + 1) - str.charAt(i) != 0))
				result += String.valueOf(str.charAt(i + 1)).toUpperCase();
			else {
				result += String.valueOf(str.charAt(i));
			}
		}
		return result;
	}

	static String findChildren1(String text) {

		return Arrays.stream(text.split("")).sorted(String.CASE_INSENSITIVE_ORDER.thenComparing(c -> c))
				.collect(Collectors.joining());
	}

	public static void main(String[] args) {

		System.out.println(findChildren("CbcBcbaA"));
	}

}
