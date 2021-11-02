package program01_11_21;

import java.util.SortedSet;
import java.util.TreeSet;

public class DoubleLinear {

	public static int dblLinear(int n) {

		SortedSet<Integer> set = new TreeSet<>();
		set.add(1);

		for (int i = 0; i < n; i++) {

			int first = set.first();
			set.add(first * 2 + 1);
			set.add(first * 3 + 1);
			set.remove(first);

		}

		return set.first();
	}

	public static void main(String[] args) {

		dblLinear(10);
	}
}
