package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length);
            int indexMin = FindLoop.indexOf(data, min, index, data.length);
            int tempt = data[index];
            data[index] = data[indexMin];
            data[indexMin] = tempt;
        }
        return data;
    }
}
