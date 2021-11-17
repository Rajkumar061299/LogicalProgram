package program02_11_21;

public class AlphabetWarAirstrike {

	public static String alphabetWar(String fight) {
		int total = 0;

		for (char c : fight.replaceAll("\\w?\\*\\w?", "").toCharArray())
			total += "zdqm".indexOf(c) - "sbpw".indexOf(c);

		return total == 0 ? "Let's fight again!" : String.format("%s side wins!", total < 0 ? "Left" : "Right");
	}

	public static void main(String[] args) {
//		AlphabetWar("s*zz"); // => Right side wins!
//		AlphabetWar("*zd*qm*wp*bs*"); // => Let's fight again!
//		AlphabetWar("zzzz*s*"); // => Right side wins!
//		AlphabetWar("www*www****z"); // => Left side wins!

		System.out.println(alphabetWar("zzzz*s*"));
	}
}
