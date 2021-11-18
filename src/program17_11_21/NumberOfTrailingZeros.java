package program17_11_21;

public class NumberOfTrailingZeros {

	public static int zeros(final int n) {
		return (n < 5) ? 0 : (n / 5) + zeros(n / 5);
	}

	public static void main(String[] args) {
		System.out.println(zeros(12));
	}
}
