package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double remainder = amount + percent / 100 * amount;
        do {
            remainder = remainder - salary;
            remainder = remainder + percent / 100 * remainder;
            year++;
        } while (remainder >= 0);
        return year;
    }
}
