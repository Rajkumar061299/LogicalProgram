package program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
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

	public static String solution1(String s) {

		Map<Integer, String> map = Arrays.stream(s.split(" ")).collect(

				Collectors.toMap(

						word -> Integer.parseInt(word.replaceAll("[^0-9]", "")), word1 -> word1

						, (oldValue, newValue) -> oldValue

						, TreeMap::new));
		return 
		map.values().stream().map(word -> word.replaceAll("[^a-zA-Z | \s]", "")).collect(Collectors.joining(" "));


	}

	public static void main(String[] args) {

		System.out.println(solution("a2re rajku4mar 1how you3"));

		System.out.println(solution1("a2re rajku4mar 1how you3"));

		// a2re rajku4mar 1how you3 --> how are you rajkumar

	}

}
