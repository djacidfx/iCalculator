package com.ical.calculator.calsuper.HatNhanCalculatorSuper;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class PerFromater {
    public static String doubleToString(double v) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        symbols.setGroupingSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setDecimalFormatSymbols(symbols);
        decimalFormat.setGroupingUsed(true);
        return decimalFormat.format(v);
    }

    public static Double stringToDouble(String str) {
        return Double.valueOf(Double.parseDouble(str.replaceAll(",", "")));
    }
}
