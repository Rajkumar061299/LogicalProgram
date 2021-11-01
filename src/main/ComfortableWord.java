package main;

public class ComfortableWord {

	public static boolean isComfortableWord(String word) {

		word.replaceAll("[qwertasdfgzxcvb]", "r");
		word.replaceAll("[^qwertasdfgzxcvb]", "l");

		System.out.println(word);
		for (int i = 0; i < word.length(); i++) {

			if ((i % 2 == 0) && (String.valueOf(word.charAt(i)).equals("r"))==true) {
				return true;
			} else if ((i % 2 != 0) && (String.valueOf(word.charAt(i)).equals("l")==true)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		System.out.println(isComfortableWord("yams"));

	}

}
