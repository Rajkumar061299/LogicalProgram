package program16_11_21;

public class Abbreviator {

	static String abbreviate(String string) {
		for (var s : string.split("[^a-zA-Z]"))
			string = string.replaceFirst(s,
					s.length() > 3 ? "" + s.charAt(0) + (s.length() - 2) + s.substring(s.length() - 1) : s);

		return string;
	}

	public static void main(String[] args) {

		System.out.println(
		abbreviate("internationalization"));
	}
}
