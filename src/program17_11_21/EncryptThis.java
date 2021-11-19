package program17_11_21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EncryptThis {

	public static String encryptThis(String text) {

		List<String> list = Arrays.stream(text.split(" "))
				.sorted((s1, s2) -> (s1.substring(1)).compareTo(s2.substring(1))).collect(Collectors.toList());

		list.forEach(System.out::println);
		return "";

//				map(i -> (int) i.charAt(0) + (i.substring(1)))
//
//				.sorted().collect(Collectors.joining(" "));

	}

	public static void main(String[] args) {

		System.out.println(encryptThis("A wise old owl lived in an oak"));
		// 65 119ise 111ld 111wl 108ived 105n 97n 111ak

	}
}
