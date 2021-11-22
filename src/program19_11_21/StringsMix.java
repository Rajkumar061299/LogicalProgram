package program19_11_21;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringsMix {

	public static void mix(String s1, String s2) {

		Map<String, Long> map1 = Arrays.stream((s1.replaceAll("[^a-z]", "")).split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));

		Map<String, Long> map2 = Arrays.stream((s2.replaceAll("[^a-z]", "")).split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));

		Map<String, Long> result = new TreeMap<>();

		for (Map.Entry<String, Long> entry1 : map1.entrySet()) {

			String key1 = entry1.getKey();

			for (Map.Entry<String, Long> entry2 : map2.entrySet()) {
				String key2 = entry2.getKey();
				if (key1.equals(key2)) {
					result.put(key1, Math.max(entry1.getValue(), entry2.getValue()));
					break;
				}

			}
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		mix("my&friend&Paul has heavy hats! &", "yes, they are here");
	}

}
