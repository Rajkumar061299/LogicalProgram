package program;

import java.util.Currency;
import java.util.Locale;

public class Currencies {

	public static String getSymbol(String country) {
		for (Locale locale : Locale.getAvailableLocales()) {
			if (locale.getDisplayCountry().equals(country)) {
				return Currency.getInstance(locale).getCurrencyCode();
			}
		}
		throw new IllegalArgumentException();
	}

	public static void main(String[] args) {

		System.out.println(getSymbol("Russia"));
	}

}
