package program22_11_21;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FrequencySequence {

	public static void main(String[] args) {
		
		System.out.println(
				freqSeq("^^^**$","x")
				);
	}
	
	
	public static String  freqSeq(String str, String sep) {
		
		List<String> list = Arrays.stream(str.split(""))
				.collect(Collectors.toList());
		
	return	list.stream().map(i -> String.valueOf(Collections.frequency(list, i))).
		collect(Collectors.joining(sep));
		
	
		
	}
}
