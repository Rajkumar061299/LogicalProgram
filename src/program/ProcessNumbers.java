package program;

import java.util.stream.IntStream;

public class ProcessNumbers {
	


	static int[] processNumbers(int[] numbers) {

		if (numbers == null)
			return new int[2];
		var even = IntStream.of(numbers).filter(i -> i % 2 == 0).summaryStatistics();
		var odd = IntStream.of(numbers).filter(i -> i % 2 > 0).summaryStatistics();

		int [] result = {

				(int) Math.pow(even.getSum(), even.getCount()),
				(int) Math.pow(odd.getSum(), odd.getCount())

		};

		for(int num : result) System.out.println(num);
		return new int[] {

				(int) Math.pow(even.getSum(), even.getCount()),
				(int) Math.pow(odd.getSum(), odd.getCount())

		};
	}

	public static void main(String[] args) {

		System.out.println(
		processNumbers(new int [] {2}));
	}



}
