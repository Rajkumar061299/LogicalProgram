package program;

public class DivBy9 {

//	0 -> true  
//	7 -> false  
//	9 -> true  
//	18 -> true  
//	19 -> false  
//	777777777777777777777777777777777777777777777 -> true

	public static boolean check(String ns) {

		return ns.chars().mapToObj(i -> (char) i).mapToInt(Character::getNumericValue).sum() % 9 == 0;

	}

	public static void main(String[] args) {

		System.out.println(check("777777777777777777777777777777777777777777777"));
	}
}
