package ru.job4j.oop;

public class Ball {
    private String name = "Колобок";

    public String getName() {
        return name;
    }

    public void roll() {
        System.out.println(name + " укатился.");
    }
}
