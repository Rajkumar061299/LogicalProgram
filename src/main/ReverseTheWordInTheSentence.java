package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseTheWordInTheSentence {

	public static String reverseTheWord(String sentence) {

		final Comparator<StringBuffer> comp = Comparator.comparing((StringBuffer s) -> s.reverse());
		return 
		Arrays.stream(sentence.split(" ")).map(StringBuffer :: new)
		.sorted(comp).collect(Collectors.joining(" "));
		

	}

	public static void main(String[] args) {

		System.out.println(reverseTheWord("Hi Hlo")); 
	}

}
