package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student();
        Freshman freshman = new Freshman();
        Student student1 = (Student) freshman;
        Object object1 = (Object) freshman;
    }
}
