package program;

import java.util.Arrays;

public class Equation {

	public static int solve(String equation) {

		/*
		 * int[] arr =
		 * Arrays.stream(equation.split("=")).mapToInt(Integer::parseInt).toArray();
		 * 
		 * return (arr[0]) / (arr[1]);
		 */
		
		return Arrays.stream(equation.split("=")).mapToInt(Integer :: valueOf)
				.reduce((left, right) -> left/right).getAsInt();
	}

	public static void main(String[] args) {
		System.out.println(solve("12=3"));
	}
}
