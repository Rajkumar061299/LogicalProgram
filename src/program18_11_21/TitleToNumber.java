package program18_11_21;

public class TitleToNumber {

	public static void titleToNumber(String title) {

		System.out.println(title.chars().mapToLong(c -> (char) c).reduce(0, (sum, cha) -> sum * 26 + cha - 64));

	}

	public static long titleToNumber1(String title) {
		long result = 0;
		for (char chr : title.toCharArray()) {
			result = (result * 26) + chr - 64;
		}
		
		return result;
	}

	public static void main(String[] args) {

		titleToNumber("BA");
	}

}
