package program18_11_21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WhereMyAnagramsAt {

	public static void main(String[] args) {
		System.out.println(Anagrams("racer",
				Arrays.asList("carer", "arcre", "carre", "racrs", "racers", "arceer", "raccer", "carrer", "cerarr")));
	}

	public static List<String> Anagrams(String word, List<String> words) {

		return words.stream().filter(str -> str.chars().sum() == word.chars().sum()).map(i -> i)
				.collect(Collectors.toList());

	}

}
