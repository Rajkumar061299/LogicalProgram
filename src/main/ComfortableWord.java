package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ComfortableWord {

	public static boolean isComfortableWord(String word) {

		word = word.replaceAll("[qwertasdfgzxcvb]", "l");

		List<Boolean> flag = new ArrayList<>();

		for (int i = 0; i < word.length(); i++) {

			if ((i % 2 == 0) && (!String.valueOf(word.charAt(i)).equals("l")) == true) {
				flag.add(true);
			} else if ((i % 2 != 0) && (String.valueOf(word.charAt(i)).equals("l") == true)) {
				flag.add(true);
			}
		}

		return flag.stream().allMatch(i -> i == true);
	}

	public static void main(String[] args) {

		System.out.println(isComfortableWord("yams"));

		System.out.println(isComfortableWord("laksjdhg"));
	}

}
