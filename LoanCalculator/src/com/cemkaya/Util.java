package com.cemkaya;

import java.text.NumberFormat;
import java.util.Locale;

public class Util {
    public static String convertCurrency(double amount, Locale locale) {
        // Get currency format for the specified locale.
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);

        return currencyFormat.format(amount);
    }
}
