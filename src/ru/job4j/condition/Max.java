package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {

        return left > right ? left : right;
    }

    public static int max(int one, int two, int three) {
        return one > two && one > three ? one : two > one && two > three ? two : three;
    }

    public static int max(int one, int two, int three, int four) {
        int[] array = {one, two, three, four};
        int max = 0;
        for (int elem : array) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

}
