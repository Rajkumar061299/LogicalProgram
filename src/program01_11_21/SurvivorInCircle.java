package program01_11_21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SurvivorInCircle {

	public static int josephusSurvivor(final int n, final int k) {

		/*
		 * int currentIndex = 0;
		 * 
		 * List<Integer> list = IntStream.rangeClosed(1,
		 * n).boxed().collect(Collectors.toList());
		 * 
		 * if (list.size() == 1) return list.get(currentIndex);
		 * 
		 * while (list.size() != 1) {
		 * 
		 * if (list.size() - 1 < k) { currentIndex = 0; }
		 * 
		 * if (currentIndex == list.size() - 1) currentIndex = -1;
		 * 
		 * list.remove(currentIndex += 2);
		 * 
		 * }
		 * 
		 * System.out.println(list.get(0)); return list.get(0);
		 */

		int remaining = 0;
		for (int i = 2; i <= n; i++) {
			remaining = (remaining + k) % i;
		}

		return remaining + 1;
	}

	public static int josephusSurvivor1(final int n, final int k) {
		List<Integer> circle = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());

		int pos = 0;
		while (circle.size() > 1) {
			pos = (pos + k - 1) % circle.size();
			circle.remove(pos);
		}

		return circle.get(0);
	}

	public static void main(String[] args) {

		System.out.println(josephusSurvivor1(7,3));
	}

}
