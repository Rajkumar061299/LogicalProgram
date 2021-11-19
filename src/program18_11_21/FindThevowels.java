package program18_11_21;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class FindThevowels {

	public static int[] vowelIndices(String word) {

		List<Integer> list = new ArrayList<>();
		String[] array = word.split("");
		for (int i = 0; i < array.length; i++) {
			if (Pattern.matches("[aeiouyAEIOUY]", array[i]))
				list.add(i + 1);
		}

		System.out.println(list);
		return list.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {

		vowelIndices("YoMama");
	}
}
