package main;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsecutiveLetters {

	public static boolean solve(String s) {

		s = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());

		char[] arr = s.toCharArray();

		boolean flag = true;

		for (int i = 0; i < (arr.length - 1); i++) {

			if ((arr[i + 1] - arr[i] != 1)) {
				flag = false;
			}
		}

		return flag;

	}

	public static boolean solve1(String s) {
		return "abcdefghijklmnopqrstuvwxyz".contains(Stream.of(s.split("")).sorted().collect(Collectors.joining()));

	}

	public static boolean solve2(String s) {

		var stat = s.chars().summaryStatistics();
		return stat.getMax() - stat.getMin() + 1 == s.length();

	}

	public static void main(String[] args) {
		System.out.println(solve("acb"));
	}

}
