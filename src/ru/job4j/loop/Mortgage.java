package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double remainder = amount + percent / 100 * amount;
        if (remainder - salary <= 0) {
            return 1;
        }
        while (remainder >= 0) {
            remainder = remainder - salary;
            remainder = remainder + percent / 100 * remainder;
            year++;
        }
        return year;
    }
}
