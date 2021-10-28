package program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static String solution(String s) {

		List<String> list = Arrays.asList(s.split(" "));

		list.sort((s1, s2) -> {
			int n1 = Integer.parseInt(s1.replaceAll("[^0-9]", ""));
			int n2 = Integer.parseInt(s2.replaceAll("[^0-9]", ""));
			return n1 - n2;
		});

		return list.stream().map(word -> word.replaceAll("[^a-zA-Z | \s]", "")).collect(Collectors.joining(" "));

	}

	public static void main(String[] args) {

		System.out.println(solution("a2re rajku4mar 1how you3"));
		
		// a2re rajku4mar 1how you3 --> how are you rajkumar


	}

}
