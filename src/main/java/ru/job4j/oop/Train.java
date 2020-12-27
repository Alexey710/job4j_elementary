package ru.job4j.oop;

public class Train implements Vehicle {
    private String name = "Поезд";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getName() + " передвигается по рельсам.");
    }
}
