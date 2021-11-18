package program17_11_21;

import java.util.ArrayList;
import java.util.List;

public class TribonacciSequence {

	public static double[] tribonacci(double[] s, int n) {

		// {0,1,1,2,4,7,13,24,44,81},

		double a = s[0];
		double b = s[1];
		double c = s[2];
		double sum = 0.0;

		List<Double> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);

		for (int i = 4; i <= 10; i++) {

			sum = a + b + c;
			list.add(sum);
			a = b;
			b = c;
			c = sum;

		}

		return list.stream().mapToDouble(i -> Math.round(i)).toArray();
	}

	public static void main(String[] args) {

		tribonacci(new double[] { 0, 1, 1 }, 10);

	}

}
