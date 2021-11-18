package program17_11_21;

import java.util.Arrays;
import java.util.Comparator;

public class HighestScoringWord {

	public static String high(String s) {

		return Arrays.stream(s.split("")).max(Comparator.comparingInt(i -> i.chars().map(a -> a - 96).sum())).get();

	}

	public static void main(String[] args) {

		System.out.println(high("ab c"));
	}
}
