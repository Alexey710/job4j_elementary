package ru.job4j.oop;

public class Aircraft implements Vehicle {
    private String name = "Самолет";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getName() + " летает по воздуху.");
    }

    public static void main(String[] args) {
        Vehicle aircraft = new Aircraft();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] vehicles = {aircraft, bus, train};
        for (Vehicle elem : vehicles) {
            elem.move();
        }
    }
}
