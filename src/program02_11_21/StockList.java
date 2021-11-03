package program02_11_21;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StockList {

	private static int stockCount(final String s) {
		return Integer.valueOf(s.split(" ")[1]);
	}

	public static String stockSummary(final String[] stock, final String[] categories) {
		if (stock.length == 0 || categories.length == 0)
			return "";
		final Map<String, Integer> counts = Arrays.stream(stock)
				.collect(Collectors.groupingBy(s -> s.substring(0, 1), Collectors.summingInt(StockList::stockCount)));
		
		System.out.println(counts);
		
		return Arrays.stream(categories).map(s -> "(" + s + " : " + counts.getOrDefault(s, 0) + ")")
				.collect(Collectors.joining(" - "));
	}

	public static void main(String[] args) {
		
		String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
		String cd[] = new String[] {"A", "B"};
		
		System.out.println(
		stockSummary(art, cd));
	}
}
