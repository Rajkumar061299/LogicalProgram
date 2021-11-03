package program02_11_21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ConsonantValue {

	public static int solve(final String s) {

		/*
		 * int sum = 0;
		 * 
		 * String[] arr = s.toLowerCase().replaceAll("[aeiou]", " ").replaceAll(" +",
		 * " ").split(" ");
		 * 
		 * List<Integer> list = new ArrayList<>();
		 * 
		 * for (String str : arr) { for (char c : str.toCharArray()) { sum += (int) c -
		 * 96; } list.add(sum); sum = 0; }
		 * 
		 * return Collections.max(list);
		 */	
		
		return Stream.of(s.split("[aeiou]")).mapToInt(con -> con.chars().map(c -> c - 96).sum()).max()
				.getAsInt();
				
	}

	public static void main(String[] args) {

		System.out.println(solve("zodiacs"));

	}

}
