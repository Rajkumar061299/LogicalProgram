package program17_11_21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NumberWaitLETTER {

	static final Comparator<String> comparator = Comparator.comparingInt(i -> Integer.parseInt(i));

	public static int doMath(String s) {

		System.out.println(s.replaceAll("[0-9]", ""));

		String result = Arrays.stream(s.split(" ")).sorted((a, b) -> {
			String s1 = a.replaceAll("[0-9]", "");
			String s2 = b.replaceAll("[0-9]", "");
			return s1.compareTo(s2);

		}

		).collect(Collectors.joining(" "));

		System.out.println(result);
		int operation = 1;
		int calculation = Integer.parseInt(

				(result.replaceAll("[^0-9 | \\s]", "").split(" "))

				[0]);

		String[] str = result.replaceAll("[^0-9 | \\s]", "").split(" ");

		for (int i = 1; i < str.length; i++) {
			switch (operation) {

			case 1:
				calculation += Integer.parseInt(str[i]);
				++operation;
				break;
			case 2:
				calculation -= Integer.parseInt(str[i]);
				++operation;
				break;
			case 3:
				calculation *= Integer.parseInt(str[i]);
				++operation;
				break;
			case 4:
				calculation /= Integer.parseInt(str[i]);
				operation = 1;
				break;
			}
		}

		System.out.println(calculation);
		return 0;
	}

	public static void main(String[] args) {

		System.out.println(doMath("10a 90x 14b 78u 45a 7b 34y"));
	}

}
