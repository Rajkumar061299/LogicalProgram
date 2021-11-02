package program01_11_21;

public class CheckPerfectSquareExample {

	static boolean checkPerfectSquare(double number) {

		double sqrt = Math.sqrt(number);

		return sqrt - Math.floor(sqrt) == 0;
		
		//         return Math.sqrt(n) % 1 == 0;

	}

	public static void main(String[] args) {

		System.out.println(
		checkPerfectSquare(25));
	}
}
