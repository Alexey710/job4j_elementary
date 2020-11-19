package ru.job4j.converter;

import java.text.DecimalFormat;

public class Converter {

    public static float rubleToEuro(int value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String floatToString = decimalFormat.format((float) value / 70);
        floatToString = floatToString.replace(',', '.');
        return  Float.parseFloat(floatToString);
    }

    public static float rubleToDollar(int value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String floatToString = decimalFormat.format((float) value / 60);
        floatToString = floatToString.replace(',', '.');
        return  Float.parseFloat(floatToString);
    }

    public static void main(String[] args) {
        int in = 140;
        float euro = Converter.rubleToEuro(in);
        float dollar = Converter.rubleToDollar(in);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");

        //test Euro
        float expected2 = 2;
        float out2 = Converter.rubleToEuro(in);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2 euro. Test result : " + passed2);

        //test Dollar
        float expected1 = 2.33f;
        float out1 = Converter.rubleToDollar(in);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2.33 dollar. Test result : " + passed1);
    }
}


