package main;

public class ExpressionMatter {

	/*
	 * Given three integers a ,b ,c, return the largest number obtained after
	 * inserting the following operators and brackets: +, *, () In other words , try
	 * every combination of a,b,c with [*+()] , and return the Maximum Obtained
	 */
	public static int expressionsMatter(int a, int b, int c) {

		return Math.max(Math.max(a + b + c, a * b * c), Math.max(a + (b * c), (a + b) * c));
	}

	public static void main(String[] args) {

		expressionsMatter(4, 5, 6);
	}

}
