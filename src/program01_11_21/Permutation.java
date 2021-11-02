package program01_11_21;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

	public static Set<String> getPermutation1(String str) {

		Set<String> permutation = new HashSet<>();
		if (str == null)
			return null;
		else if (str.length() == 0) {
			permutation.add("");
			return permutation;
		}

		char first = str.charAt(0);
		String sub = str.substring(1);

		Set<String> words = getPermutation1(sub);

		for (String s : words) {
			for (int i = 0; i <= s.length(); i++) {
				permutation.add(s.substring(0, i) + first + s.substring(i));
			}
		}
		return permutation;

	}

	public static void main(String[] args) {

		// aabb", "abab", "abba", "baab", "baba", "bbaa
//		[baba, aabb, abba, bbaa, baab, abab]

		System.out.println(getPermutation1("aabb"));

		// [baba, aabb, abba, bbaa, baab, abab]

	}
}
