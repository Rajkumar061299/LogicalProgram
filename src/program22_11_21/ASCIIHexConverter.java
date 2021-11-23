package program22_11_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ASCIIHexConverter {

	public static int hexadecimalConversion(int i) {

		return 0;

	}

	public static void main(String[] args) {

		System.out.println(convertStringToHex("Look mom, no hands"));
		System.out.println(convertHexToString("4c6f6f6b206d6f6d2c206e6f2068616e6473"));
	}

	public static String convertStringToHex(String str) {

		return Arrays.stream(str.split("")).map(i -> String.valueOf(Integer.toHexString((int) i.charAt(0))))
				.collect(Collectors.joining(""));

	}

	public static String convertHexToString(String str) {

		List<String> list = new ArrayList<>();
		int start = 0;
		for (int i = 0; i < str.length(); i += 2) {
			list.add(str.substring(start, i + 2));
			start += 2;
		}

		return list.stream().mapToInt(i -> Integer.parseInt(i, 16)).mapToObj(i -> "" + (char) i)
				.collect(Collectors.joining(""));
	}

}
