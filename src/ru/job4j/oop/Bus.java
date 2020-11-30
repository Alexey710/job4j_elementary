package ru.job4j.oop;

public class Bus implements Vehicle {
    private String name = "Автобус";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getName() + " двигается по скоростным трассам.");
    }
}
