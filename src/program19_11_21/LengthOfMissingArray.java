package program19_11_21;

import java.util.Arrays;

public class LengthOfMissingArray {

	public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {

		int[] arr = Arrays.stream(arrayOfArrays).map(i -> i.length).sorted().mapToInt(i -> i).toArray();

		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i + 1] - arr[i]) != 1)
				return arr[i+1]-1;
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(
		getLengthOfMissingArray(new Object[][] { new Object[] { 1, 2 }, new Object[] { 4, 5, 1, 1 }, 
			new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }})); 
	}

}
