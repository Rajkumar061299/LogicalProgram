package program02_11_21;

public class LowestProductOf4ConsecutiveNumbers {

	public static int convertStringtoInt(char c) {
		return Integer.parseInt(String.valueOf(c));
	}

	static String lowestProduct1(String input) {

		if (input.length() < 4)
			return "Number is too small";

		int min = convertStringtoInt(input.charAt(0)) * convertStringtoInt(input.charAt(1))
				* convertStringtoInt(input.charAt(2)) * convertStringtoInt(input.charAt(3));

		for (int i = 1; i < input.length() - 3; i++) {
			int value = convertStringtoInt(input.charAt(i)) * convertStringtoInt(input.charAt(i + 1))
					* convertStringtoInt(input.charAt(i + 2)) * convertStringtoInt(input.charAt(i + 3));

			min = Math.min(min, value);
		}

		return String.valueOf(min);
	}

	public static void main(String[] args) {

		System.out.println(lowestProduct1("123456"));

	}

}
