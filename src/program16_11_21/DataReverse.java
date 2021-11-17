package program16_11_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataReverse {

	public static int[] DataReverse(int[] data) {

		List<int[]> list = new ArrayList<>();

		for (int i = 0; i < data.length / 8; i += 8)
			list.add(Arrays.copyOfRange(data, i, i + 8));

		Collections.reverse(list);

		return list.stream().flatMapToInt(Arrays::stream).toArray();
	}

	public static void main(String[] args) {

		int[] data1 = { 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1 };

		int[] result = DataReverse(data1);

		for (int i : result) {
			System.out.print(i + " "); // 0 0 1 0 1 0 0 1 0 0 1 1 0 1 1 0
		}
	}
}
