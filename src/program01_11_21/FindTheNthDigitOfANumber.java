package program01_11_21;

public class FindTheNthDigitOfANumber {

	public static int findDigit(int num, int nth) {

		num = Math.abs(num);
		if (nth <= 0)
			return -1;

		String reverse = new StringBuilder(String.valueOf(num)).reverse().toString();

		if (nth <= reverse.length())
			return Integer.parseInt(String.valueOf(reverse.charAt(nth - 1)));
		else {
			return 0;
		}
	}

	public static int findDigit1(int num, int nth) {

		String number = String.valueOf(Math.abs(num));
		if (nth <= 0)
			return -1;
		else {

			if (nth <= number.length())
				return Integer.parseInt(String.valueOf(number.charAt(number.length() - nth)));
			else {
				return 0;
			}
		}
	}

	public static void main(String[] args) {

		// 5432 -> 3 => 4
		System.out.println(findDigit1(65, 0));
	}

}
