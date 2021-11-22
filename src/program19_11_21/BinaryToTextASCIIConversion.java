package program19_11_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinaryToTextASCIIConversion {

	public static int convertBinaryToNumeric(String s) {

		int sum = 0, pow = 0;

		List<Integer> list = Arrays.stream(s.split("")).map(Integer::parseInt).collect(Collectors.toList());

		Collections.reverse(list);

		for (int i : list) {
			sum += i * Math.pow(2, pow++);
		}
		return sum;

	}

	public static String binaryToText(String binary) {

		List<String> list = new ArrayList<>();

		int s = 0;
		for (int i = 0; i < binary.length(); i += 8) {
			list.add(binary.substring(s, i + 8));
			s += 8;
		}

		String result = list.stream().map(i -> (char) convertBinaryToNumeric(i) + "")

				.collect(Collectors.joining(""));

		return result;
	}

	public static String binaryToText1(String binary) {

		return IntStream.iterate(0, i -> i < binary.length(), i -> i + 8)
				.mapToObj(i -> "" + (char) Integer.parseInt(binary.substring(i, i + 8), 2))
				.collect(Collectors.joining(""));
	}

	public static void main(String[] args) {

		System.out.println(

				binaryToText("0100100001100101011011000110110001101111"));
	}

}
