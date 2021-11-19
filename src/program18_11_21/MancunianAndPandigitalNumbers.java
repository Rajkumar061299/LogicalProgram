package program18_11_21;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MancunianAndPandigitalNumbers {

	public static int findPandigitalNumbers1(int start, int end) {

		int count = 0;

		final List<String> numberList = Collections
				.unmodifiableList(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));

		final List<String> numberList1 = Collections
				.unmodifiableList(Arrays.asList("1", "12", "123", "1234", "12345", "123456", "1234567", "12345678", "123456789"));
		for (int i = start; i <= end; i++) {

			String sortedStr = Arrays.stream(String.valueOf(i).split("")).sorted().collect(Collectors.joining(""));

			/*
			 * String numString =
			 * numberList.stream().limit(sortedStr.length()).collect(Collectors.joining(""))
			 * ;
			 * 
			 * if (sortedStr.equals(numString)) count++;
			 */
			
			if(numberList1.contains(sortedStr)) count++;
		}
		return count;
	}

	public static int findPandigitalNumbers(int start, int end) {

		
		boolean flag = false;

		int count = 0, size = 0;

		for (int i = start; i <= end; i++) {

			List<String> list = Arrays.stream(String.valueOf(i).split("")).sorted().collect(Collectors.toList());

			size = list.size();
			if ((size == 1) && (Integer.parseInt(list.get(0)) == 1)) {
				flag = true;
			}

			else if ((( Integer.parseInt(list.get(0)) != 0) || ( Integer.parseInt(list.get(0)) == 1))  && list.size() != 1) {

				for (int j = 0; j < size - 1; j++) {

					if ((Integer.parseInt(list.get(j + 1)) - Integer.parseInt(list.get(j))) == 1) {
						flag = true;
					} else
						flag = false;
				}
			}

			if (flag == true)
				count++;
			flag = false;
		}

		return count;
	}

	public static void main(String[] args) {

		System.out.println(findPandigitalNumbers(1, 30));
	}

}
