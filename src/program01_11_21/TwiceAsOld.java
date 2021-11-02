package program01_11_21;

public class TwiceAsOld {

	public static int twiceAsOld(int dadYears, int sonYears) {

		// a + x = 2 * (b+x);

		return Math.abs(dadYears - (2 * sonYears));

	}

	public static void main(String[] args) {

		System.out.println(twiceAsOld(55, 30));
	}
}
