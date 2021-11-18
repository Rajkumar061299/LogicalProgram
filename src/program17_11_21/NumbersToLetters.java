package program17_11_21;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumbersToLetters {

	public static void main(String[] args) {
		System.out.println(switcher(new int[] { 24, 12, 23, 22, 4, 26, 9, 8 }));
	}

	public static String switcher(int[] arr) {

		Map<Integer, Character> map = new LinkedHashMap<>();
		int a = 97;
		String result = "";
		for (int i = 26; i >= 1; i--)
			map.put(i, (char) a++);
		map.put(27, '!');
		map.put(28, '?');
		map.put(29, ' ');

		for (int i : arr)
			result += map.get(i);

		return result;
	}

}
