package program18_11_21;

public class ProdFib {

	public static long[] productFib(long prod) {

		long a = 0;
		long b = 1;
		while (prod > a * b) {
			long sum = a + b;
			b = a;
			b = sum;
		}
		return new long[] { a, b, a * b == prod ? 1 : 0 };
	}

	public static void main(String[] args) {
		productFib(5895);
	}
}
