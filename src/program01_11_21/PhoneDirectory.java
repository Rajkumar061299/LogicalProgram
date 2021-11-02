package program01_11_21;

public class PhoneDirectory {

	public static String phone(String strng, String num) {
		String found = null;
		int count = 0;
		for (String entry : strng.split("\n"))
			if (entry.contains("+" + num)) {
				found = entry;
				count++;
			}

		System.out.println(found);
		System.out.println(count);
		// error cases
		if (count == 0)
			return "Error => Not found: " + num;
		if (count > 1)
			return "Error => Too many people: " + num;

		// process found entry
		String name = found.split("<|>")[1];
		
		System.out.println(name);
		
		System.out.println(found.replace(name, ""));
		
		System.out.println(found.replace(name, "").replace(num, ""));
		
		System.out.println(found.replace(name, "").replace(num, "").replaceAll("[^A-Za-z0-9\\. -]", " "));
		
		System.out.println(found.replace(name, "").replace(num, "").replaceAll("[^A-Za-z0-9\\. -]", " ").trim().replaceAll(" +", " "));
		
		String address = found.replace(name, "").replace(num, "") // only address left
				.replaceAll("[^A-Za-z0-9\\. -]", " ") // filter all unnecessary chars
				.trim().replaceAll(" +", " "); // reduce extra spaces
		
		

		return "Phone => " + num + ", Name => " + name + ", Address => " + address;
	}

	public static void main(String[] args) {

		String dr = "/+1-541-754-3010 156 Alphand_St. <J Steeve>\n 133, Green, Rd. <E Kustur> NY-56423 ;+1-541-914-3010\n"
				+ "+1-541-984-3012 <P Reed> /PO Box 530; Pollocksville, NC-28573\n :+1-321-512-2222 <Paul Dive> Sequoia Alley PQ-67209\n"
				+ "+1-741-984-3090 <Peter Reedgrave> _Chicago\n :+1-921-333-2222 <Anna Stevens> Haramburu_Street AA-67209\n"
				+ "+1-111-544-8973 <Peter Pan> LA\n +1-921-512-2222 <Wilfrid Stevens> Wild Street AA-67209\n"
				+ "<Peter Gone> LA ?+1-121-544-8974 \n <R Steell> Quora Street AB-47209 +1-481-512-2222\n"
				+ "<Arthur Clarke> San Antonio $+1-121-504-8974 TT-45120\n <Ray Chandler> Teliman Pk. !+1-681-512-2222! AB-47209,\n"
				+ "<Sophia Loren> +1-421-674-8974 Bern TP-46017\n <Peter O'Brien> High Street +1-908-512-2222; CC-47209\n"
				+ "<Anastasia> +48-421-674-8974 Via Quirinal Roma\n <P Salinger> Main Street, +1-098-512-2222, Denver\n"
				+ "<C Powel> *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000\n <Bernard Deltheil> +1-498-512-2222; Mount Av.  Eldorado\n"
				+ "+1-099-500-8000 <Peter Crush> Labrador Bd.\n +1-931-512-4855 <William Saurin> Bison Street CQ-23071\n"
				+ "<P Salinge> Main Street, +1-098-512-2222, Denve\n"
				+ "<P Salinge> Main Street, +1-098-512-2222, Denve\n";

		System.out.println(phone(dr, "48-421-674-8974"));
	}
}
