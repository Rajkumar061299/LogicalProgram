package program16_11_21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Order {

	public static String order(String words) {

		if (words.split(" ").length == 0)
			return words;

		return Arrays.stream(words.split(" ")).sorted((s1, s2) -> {
			int n1 = Integer.parseInt(s1.replaceAll("[^0-9]", ""));
			int n2 = Integer.parseInt(s2.replaceAll("[^0-9]", ""));
			return n1 - n2;
		}).collect(Collectors.joining(" "));
	}

	public static String order1(String words) {

		return Arrays.stream(words.split(" "))
				.sorted(Comparator.comparingInt(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
				.collect(Collectors.joining(" "));
	}

	public static void main(String[] args) {
		System.out.println(order1("4of Fo1r pe6ople g3ood th5e the2"));

		System.out.println(order1(""));
	}
}
