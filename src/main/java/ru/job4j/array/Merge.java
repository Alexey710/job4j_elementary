package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int r = 0;
        int l = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (l < left.length && left[l] <= right[r]) {
                rsl[i] = left[l];
                l++;
            } else if (r < right.length) {
                rsl[i] = right[r];
                r++;
            }
        }
        return rsl;
    }
}
