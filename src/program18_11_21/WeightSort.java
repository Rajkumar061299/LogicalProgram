package program18_11_21;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightSort {

	public static int sumOfTheNumber(String s) {
		return Arrays.stream(s.split("")).mapToInt(Integer::parseInt).sum();
	}

	public static String orderWeight(String strng) {

		return Arrays.stream(strng.split(" ")).sorted((s1, s2) -> {

			int a = sumOfTheNumber(s1);
			int b = sumOfTheNumber(s2);

			return (a == b) ? s1.compareTo(s2) : a - b;

		}).collect(Collectors.joining(" "));
	}

	public static void main(String[] args) {

		System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
	}

}
