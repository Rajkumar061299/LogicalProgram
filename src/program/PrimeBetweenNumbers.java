package program;

public class PrimeBetweenNumbers {

	public static int returnPrimeBetweenNumbers(int lowestNumber, int highestNumber) {

		for (int i = highestNumber - 1; i > lowestNumber; i--) {
			if (isPrime(i))
				return i;

		}

		return -1;
	}

	private static boolean isPrime(int n) {

		if (n <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(returnPrimeBetweenNumbers(5, 10));
	}

}
