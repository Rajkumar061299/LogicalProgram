package program22_11_21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SequenceDeterminer {

	public static void main(String[] args) {

		System.out.println(
		determine_sequence(Arrays.asList(2, 5, 8, 11, 14)));
	}

	public static int determine_sequence(List<Integer> list) {

		if (checkIsAP(list))
			return 0;

		else if (checkIsGP(list))
			return 1;

		else if (checkIsAP(list) && checkIsGP(list))
			return 2;

		else
			return -1;
	}

	public static boolean checkIsAP(List<Integer> list) {

		return IntStream.range(0, list.size()-1).map(i -> list.get(i + 1) - list.get(i)).distinct().count() <= 1;

	}

	public static boolean checkIsGP(List<Integer> list) {

		return IntStream.range(0, list.size()-1).map(i -> list.get(i + 1) / list.get(i)).distinct().count() <= 1;

	}

}
