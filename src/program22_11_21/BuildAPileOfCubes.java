package program22_11_21;

public class BuildAPileOfCubes {

	public static long findNb(long m) {

		long total = 0, n = 0;

		while (total < m)
			total += ++n * n * n;

		return total == m ? n : -1;
	}

	public static void main(String[] args) {

		System.out.println(

				findNb(40539911473216L));
		
		 
        String str= "Geeks", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }

	

}
