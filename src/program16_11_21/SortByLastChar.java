package program16_11_21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLastChar {

	public static List<String> sortBasedOnLastChar(String sentence) {

		return Arrays.asList(sentence.split(" ")).stream().sorted((s1, s2) -> {
			String a = String.valueOf(s1.charAt(s1.length() - 1));
			String b = String.valueOf(s2.charAt(s2.length() - 1));
			if (a == b)
				return -1;
			return a.compareTo(b);
		}).collect(Collectors.toList());

	}

	public static void main(String[] args) {

		System.out.println(sortBasedOnLastChar("man i need a taxi up to ubud"));
		System.out.println(sortBasedOnLastChar("man i need a taxi up to ubud nat"));

	}

}
