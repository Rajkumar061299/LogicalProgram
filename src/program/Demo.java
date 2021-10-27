package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	static String word = "Never gonna ";
	private static final String[] CHORUS = { "give you up", "let you down", "run around and desert you", "make you cry",
			"say goodbye", "tell a lie and hurt you" };

	public static List<String> music(List<Integer> numbers) {

		List<String> result = new ArrayList<>();

		for (int num : numbers) {

			result.add(CHORUS[num]);

		}

		String s = "";

		for (int i = 0; i < result.size(); i++) {
			s = result.get(i);
			if (i % 2 == 0) {
				result.set(i, word.concat(s));
			} else {
				result.set(i, (word.toUpperCase()).concat(s));
			}
		}

		return result;

	}

	public static void main(String[] args) {

		System.out.println(music(Arrays.asList(0, 1, 2, 3, 4, 5)));
	}
	/*
	 * add("Never gonna give you up"); add("NEVER GONNA let you down");
	 * add("Never gonna run around and desert you");
	 * add("NEVER GONNA make you cry"); add("Never gonna say goodbye");
	 * add("NEVER GONNA tell a lie and hurt you");
	 */

	/*
	 * [NEVER GONNA give you up, NEVER GONNA let you down, NEVER GONNA run around
	 * and desert you, NEVER GONNA make you cry, NEVER GONNA say goodbye, NEVER
	 * GONNA tell a lie and hurt you]
	 */

}
