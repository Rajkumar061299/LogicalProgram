package program16_11_21;

public class EqualSidesOfAnArray {

	public static int findEvenIndex(int[] arr) {

		int value1 = 0, value2 = 0, sum = 0;

		for (int l = 1; l < arr.length; l++) {
			sum += arr[l];
		}

		if (sum == 0)
			return 0;

		else {
			for (int i = 1; i < arr.length - 2; i++) {

				for (int j = i - 1; j >= 0; j--)
					value1 += arr[j];

				for (int k = i + 1; k < arr.length; k++)
					value2 += arr[k];

				if (value1 == value2)
					return i;

				value1 = 0;
				value2 = 0;
			}
			return -1;

		}

	}

	public static void main(String[] args) {

		System.out.println(findEvenIndex(new int[] { 20, 10, 30, 10, 10, 15, 35 }));

	}

}
