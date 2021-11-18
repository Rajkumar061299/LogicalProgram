package program17_11_21;

import java.util.Arrays;

public class HexToRGB {

	public static int[] hexStringToRGB(String hex) {
		int[] rgb = new int[3];
		int s = 1, e = 3;
		for (int i = 0; i < 3; i++) {
			rgb[i] = Integer.parseInt((hex.substring(s, e)), 16);
			s += 2;
			e += 2;
		}
		return rgb;
	}

	public static void main(String[] args) {

		Arrays.stream(hexStringToRGB("#Fa3456")).forEach(System.out::println);
	}
}
