package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Bus goes.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Amount of passengers is " + count);
    }

    @Override
    public int fuel(int liters) {
        int price = 45;
        return liters * price;
    }
}
