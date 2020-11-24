package ru.job4j.array;

public class Defragment {
    public static String[] compress2(String[] array) {
        String[] arrayBuffer = new String[array.length];
        int indexStart = 0;
        int indexEnd = array.length - 1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) {
                arrayBuffer[indexStart] = array[index];
                indexStart++;
            } else {
                arrayBuffer[indexEnd] = array[index];
                indexEnd--;
            }
        }
        return arrayBuffer;
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) {
                int indexNotNull = index;
                for (int indexNull = 0; indexNull < array.length; indexNull++) {
                    if (array[indexNull] == null) {
                        String temp = array[indexNotNull];
                        array[indexNotNull] = array[indexNull];
                        array[indexNull] = temp;
                    }
                }

                /* переместить первую не null ячейку. Нужен цикл. */
            }
            System.out.print(array[index] + " ");
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
