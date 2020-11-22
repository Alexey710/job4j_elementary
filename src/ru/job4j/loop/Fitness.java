package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int progressPowerDeadliftPerMonthOfNic = nik;
        int progressPowerDeadliftPerMonthOfIvan = ivan;
        int month = 0;
        while (progressPowerDeadliftPerMonthOfNic > progressPowerDeadliftPerMonthOfIvan) {
            progressPowerDeadliftPerMonthOfNic = progressPowerDeadliftPerMonthOfNic * 2;
            progressPowerDeadliftPerMonthOfIvan = progressPowerDeadliftPerMonthOfIvan * 3;
            month++;
        }
        return month;
    }
}
