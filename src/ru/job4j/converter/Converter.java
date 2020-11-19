package ru.job4j.converter;

import java.text.DecimalFormat;

public class Converter {

    public static String rubleToEuro(int value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return  decimalFormat.format((float) value / 70);

    }

    public static String rubleToDollar(int value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return  decimalFormat.format((float) value / 60);/* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        String euro = Converter.rubleToEuro(140);
        String dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
