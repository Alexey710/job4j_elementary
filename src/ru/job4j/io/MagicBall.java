package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {

        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");

        int num = new Random().nextInt(3);

        String answer = switch (num) {
            case 0 -> "Да";
            case 1 -> "Нет";
            default -> "Может быть";
        };

        new Scanner(System.in).nextLine();

        System.out.println(answer);
    }
}
