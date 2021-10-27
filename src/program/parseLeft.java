package program;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class parseLeft {

	public static String partsLeft(boolean CPU, boolean motherboard, boolean ram, boolean GPU, boolean hardDrive,
			boolean powerSupply, boolean desktopCase, boolean lights) {

		
		  String result = "";
		  
		  if (CPU == false && motherboard == false && ram == false && GPU == false &&
		  hardDrive == false && powerSupply == false && desktopCase == false && lights
		  == false) return "No items bought!";
		  
		  if (CPU == true && motherboard == true && ram == true && GPU == true &&
		  hardDrive == true && powerSupply == true && desktopCase == true && lights ==
		  true) return "Your PC is ready to build!";
		  
		  if (CPU == false) result += "CPU, "; if (motherboard == false) result +=
		  "motherboard, "; if (ram == false) result += "ram, "; if (GPU == false)
		  result += "GPU, "; if (hardDrive == false) result += "hardDrive, "; if
		  (powerSupply == false) result += "powerSupply, "; if (desktopCase == false)
		  result += "desktopCase, "; if (lights == false) result += "lights, ";
		  
		  return result.substring(0, result.length()-2) + ".";
		 

	}

	static String partsLeft1(boolean... parts) {

		if (IntStream.range(0, 8).allMatch(i -> parts[i]))
			return "Your PC is ready to build!";

		if (IntStream.range(0, 8).noneMatch(i -> parts[i]))
			return "No items bought!";
		String[] names = { "CPU", "motherboard", "ram", "GPU", "hardDrive", "powerSupply", "desktopCase", "lights" };

		return IntStream.range(0, 8).filter(i -> !parts[i]).mapToObj(i -> names[i]).collect(Collectors.joining(", ")) 
				+ ".";
				
	}

	public static void main(String[] args) {

		System.out.println(partsLeft(false, true, true, false, true, true, false, true));

		partsLeft1(false, true, true, false, true, true, false, true);
	}
}
