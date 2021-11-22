package program19_11_21;

public class MaximumSubarraySum {

	public static int sequence(int[] arr) {

		int sum = 0, max = 0;

		for (int i : arr) {
			sum += i;
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
		}

		return max;
	}

	public static void main(String[] args) {

		System.out.println(sequence(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

}
