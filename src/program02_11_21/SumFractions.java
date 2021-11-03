package program02_11_21;

import java.math.BigInteger;
import java.util.Arrays;

public class SumFractions {

	public static String sumFracts(int[][] l) {
		if (l.length == 0)
			return null;

		final int denomentor = Arrays.stream(l).mapToInt(ar -> ar[1]).reduce(1, (a, b) -> a * b);
		System.out.println(denomentor);

		final int numerator = Arrays.stream(l).mapToInt(ar -> ar[0] * denomentor / ar[1]).sum();
		System.out.println(numerator);

		int gcd = BigInteger.valueOf(denomentor).gcd(BigInteger.valueOf(numerator)).intValue();
		
		System.out.println(gcd);

		return (denomentor == gcd) ? String.valueOf(numerator / denomentor)
				: String.format("[%d, %d]", numerator / gcd, denomentor / gcd);
	}

	public static void main(String[] args) {

		int[][] a = new int[][] { { 1, 2 }, { 2, 9 }, { 3, 18 }, { 4, 24 }, { 6, 48 } };

		int[][] b = new int[][] { { 1, 3 }, { 5, 3 } };
		
		int [][] c = new int [][] { {1, 2}, {1, 3}, {1, 4} };
		
		System.out.println(sumFracts(b));
	}
}
