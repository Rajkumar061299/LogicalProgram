package program;

import java.util.Arrays;

public class StringCalculatorFunctional {

	private final static String ERROR_MESSAGE = "Calculation failed";

	public static String sum(String input) {

		input = input.replaceAll("[^-?0-9]+", " ");

		if (input.equals("") || input.equals(" "))
			return ERROR_MESSAGE;

		return String.valueOf(Arrays.asList(input.trim().split(" ")).stream().mapToInt(Integer::parseInt).sum());

	}

	/**
	 * Calculates sum
	 *
	 * @param input - input string of numbers
	 * @return sum of numbers
	 */
	public static void main(String[] args) {

		System.out.println(sum("Raj12kumar35+e-3"));
	}

}
