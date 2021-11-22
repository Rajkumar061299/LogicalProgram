package program19_11_21;

public class AliceAndCandies {

	public static int findNumberOfDifferentSetsOfCandyPackets(int n) {

		int sum = 0, count = 0, end = (int) Math.ceil(n / 2);

		for (int i = 1; i <= end; i += 2) {

			for (int j = i; j <= end; j += 2) {

				sum += j;

				if (sum == n) {
					count++;
					break;
				} else if (sum > n)
					break;
			}

			sum = 0;
		}
		return count+1;
	}

	public static void main(String[] args) {

		System.out.println(findNumberOfDifferentSetsOfCandyPackets(45));
	}

}
