package ru.job4j.calculator;

public class Fit {

    public static double man(short height) {
        return (height - 100) * 1.15;

    }

    public static double woman(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.man(height);
        System.out.println("Man 187 is " + man);
    }

}
