package program18_11_21;

public class Persist {

	/*
	 * persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4 // and 4 has only
	 * one digit
	 * 
	 * persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126, // 1*2*6 = 12, and
	 * finally 1*2 = 2
	 * 
	 * persistence(4) == 0 // because 4 is already a one-digit number
	 */

	public static int persistence(long n) {

		long mul = 1, r = 0;
		int count = 0;

		while (n / 10 != 0) {
			while (n > 0) {
				r = n % 10;
				mul *= r;
				n /= 10;
			}
			n = mul;
			count++;
			r = 0;
			mul = 1;
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println(persistence(39));
	}

}
