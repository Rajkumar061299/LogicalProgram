package program17_11_21;

public class Scramblies {

	public static boolean scramble(String str1, String str2) {
		if (str1 == null || str2 == null)
			return false;
		if (str2.length() > str1.length())
			return false;

		for (String s : str2.split("")) {
			if (!str1.contains(s))
				return false;
			str1 = str1.replaceFirst(s, "");
		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println(scramble("sammoc", "commas"));
	}
}
