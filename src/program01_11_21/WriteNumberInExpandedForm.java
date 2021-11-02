package program01_11_21;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WriteNumberInExpandedForm {

	public static String expandedForm(int num) {

		var s = "" + num;

		return IntStream.range(0, s.length()).mapToObj(i -> s.charAt(i) + "0".repeat(s.length() - 1 - i))
				.filter(e -> !e.matches("0+")).collect(Collectors.joining(" + "));
	}

	public static void main(String[] args) {

		System.out.println(expandedForm(7004));
		System.out.println(Math.ceil(2.4));
	}
}
