package main;

public class ConsecutiveDucks {

	public static boolean consecutiveDucks(int n) {

		System.out.println(Math.log(n));
		System.out.println(Math.log(2));
		System.out.println(Math.log(n) / Math.log(2));
		
		
		System.out.println(
				
				(Math.log(n) / Math.log(2) != (int)Math.log(n) / Math.log(2)));
				
				
		int m = (n / 2) + 1, sum = 0;

		while (m > 0) {
			for (int i = m; i >= 1; i--) {
				sum += i;
			if (sum == n)
				return true;
			}
			sum = 0;
			m--;
		}

		return false;
	}

	public static void main(String[] args) {

		System.out.println(consecutiveDucks(522));
	}

}
