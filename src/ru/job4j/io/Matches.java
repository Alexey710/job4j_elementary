package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        Scanner player = new Scanner(System.in);
        byte count = 0;

        while (matches > 0) {
            String show = count % 2 == 0 ? "Are moving a player 1 ..." : "Are moving a player 2 ...";
            System.out.println(show);
            int move = Integer.valueOf(player.nextLine());
            if (move < 1 || move > 3) {
                System.out.println("An incorrect move. Try to input one more time -  from 1 to 3.");
            } else {
                matches = matches - move;
                count++;
                System.out.println("Remainder of matches is " + matches);
                if (matches <= 0) {
                    show = count % 2 != 0 ? "Win player 1." : "Win player 2.";
                    System.out.println(show);
                }
            }
        }
    }
}
