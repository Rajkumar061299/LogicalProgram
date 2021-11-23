package program22_11_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GapInPrimes {

	public static void main(String[] args) {

		long[] result = GapInPrimes.gap(6, 100, 110);

		Arrays.stream(result).forEach(e -> System.out.println(e));
	}

	public static long[] gap(int g, long m, long n) {

		long[] result = new long[2];

		List<Long> list = new ArrayList<>();

		for (long i = m; i <= n; i++) {
			if (isPrime(i))
				list.add(i);
		}

		System.out.println(list);

		for (int i = 0; i < list.size() - 1; i++) {
			if ((list.get(i + 1) - list.get(i)) == g) {
				result[0] = list.get(i);
				result[1] = list.get(i + 1);
				break;
			}
		}

		if (Arrays.stream(result).filter(i -> i != 0).count() == 0)
			return null;
		return result;
	}

	private static boolean isPrime(long j) {

		if (j < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(j); i++) {

			if (j % i == 0)
				return false;
		}

		return true;
	}
}
