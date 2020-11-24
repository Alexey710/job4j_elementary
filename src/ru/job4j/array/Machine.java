package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        while (change > 0) {
            for (int i = 0; i < coins.length; i++) {
                int changeCoins = change - coins[i];
                if (changeCoins >= 0) {
                    change = changeCoins;
                    size++;
                    rsl[i] = coins[i];
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
