package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopWord {

	public static void main(String[] args) {

		System.out.println(
		top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
		System.out.println(
				top3("In a village of La Mancha, the name of which I have no desire to call to\r\n"
						+ "mind, there lived not long since one of those gentlemen that keep a lance\r\n"
						+ "in the lance-rack, an old buckler, a lean hack, and a greyhound for\r\n"
						+ "coursing. An olla of rather more beef than mutton, a salad on most\r\n"
						+ "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra\r\n"
						+ "on Sundays, made away with three-quarters of his income."));
		
	}

	public static List<String> top3(String s) {

		List<String> result = new ArrayList<>();

		if (s == null)
			return Arrays.asList();

		s = s.toLowerCase().replaceAll("[^a-zA-z0-9 | \s | ']", "").trim();

		System.out.println(s);
		if (s.length() == 0)
			return Arrays.asList();

		LinkedHashMap<String, Long> map = Arrays.stream(s.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		for (String str : map.keySet())
			result.add(str);

		return result.stream().limit(3).collect(Collectors.toList());
	}

}
