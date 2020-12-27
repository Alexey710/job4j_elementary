package ru.job4j.array;

public class Defragment {
    public static String[] compress2(String[] array) {
        String[] buffer = new String[array.length];
        int start = 0;
        int end = array.length - 1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) {
                buffer[start] = array[index];
                start++;
            } else {
                buffer[end] = array[index];
                end--;
            }
        }
        return buffer;
    }

    public static String[] compress(String[] array) {
        for (int empty = 0; empty < array.length; empty++) {
            if (array[empty] == null) {
                for (int target = empty + 1; target < array.length; target++) {
                    if (array[target] != null) {
                        String temp = array[empty];
                        array[empty] = array[target];
                        array[target] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
