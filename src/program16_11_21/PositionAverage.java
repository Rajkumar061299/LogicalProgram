package program16_11_21;

public class PositionAverage {

	static int countSimilarities(String a, String b) {

		int result = 0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(i))
				++result;
		}

		return result;
	}

	public static double posAverage(String s) {

		String[] array = s.split(", ");

		int numSimilarities = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				numSimilarities += countSimilarities(array[i], array[j]);
			}

		}

		int numPossibleSimilarities = (array.length * (array.length - 1) * array[0].length()) / 2;

		return (numSimilarities * 100.0) / numPossibleSimilarities;

	}

	public static void main(String[] args) {

		System.out.println(posAverage("6900690040, 4690606946, 9990494604"));

	}
}
