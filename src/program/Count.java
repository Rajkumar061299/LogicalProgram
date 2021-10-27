package program;

import java.util.Arrays;

public class Count {

	public static int countSheeps(Boolean[] arrayOfSheeps) {
		
		if(arrayOfSheeps == null) return 0;
		if(arrayOfSheeps.length==0) return 0;
		
		return (int)Arrays.stream(arrayOfSheeps)
				.filter(i -> i != null)
				.filter(i -> i == true).
				count();

	}

	public static void main(String[] args) {
		
		Boolean [] array =  {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true , null};

		System.out.println(countSheeps(array));
	}

}
