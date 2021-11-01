package main;

import java.util.Arrays;
import java.util.List;

public class ConsecutiveDifferences {

//	differences([1, 2, 3]) => [1, 1] => [0] => 0
//	differences([1, 5, 2, 7, 8, 9, 0]) => [4, 3, 5, 1, 1, 9] => [1, 2, 4, 0, 8] => ... => 1
//	differences([2, 3, 1]) => [1, 2] => 1

	public static int difference(List<Integer> list) {

		int n = list.size();
		while (n > 1) {
			for (int i = 0; i < list.size() - 1; i++) 
				list.set(i, Math.abs(list.get(i + 1) - list.get(i)));
			n--;
		}

		return list.get(0);
	}

	public static void main(String[] args) {

		System.out.println(difference(Arrays.asList(-1, 2, 3)));
	}
}
