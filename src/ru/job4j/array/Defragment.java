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
        for (int indexNull = 0; indexNull < array.length; indexNull++) {
            if (array[indexNull] == null) {
                for (int indexNotNull = indexNull + 1; indexNotNull < array.length; indexNotNull++) {
                    if (array[indexNotNull] != null) {
                        String temp = array[indexNull];
                        array[indexNull] = array[indexNotNull];
                        array[indexNotNull] = temp;
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
