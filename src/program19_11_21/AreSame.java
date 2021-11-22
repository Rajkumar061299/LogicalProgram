package program19_11_21;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AreSame {

	public static void main(String[] args) {

		int[] a = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };
		int[] b = new int[] { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };

		System.out.println(comp(a, b));
	}

	public static boolean comp(int[] a, int[] b) {

		if (a == null || b == null)

			return false;

		return Arrays.stream(a).map(i -> i * i).sorted().boxed().collect(Collectors.toList())
				.equals(Arrays.stream(b).sorted().boxed().collect(Collectors.toList()));
	}
}
