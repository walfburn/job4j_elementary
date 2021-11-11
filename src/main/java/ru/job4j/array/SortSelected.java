package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int indexArray = 0; indexArray < data.length; indexArray++) {
            int min = MinDiapason.findMin(data, indexArray, data.length - 1);
            int index = FindLoop.indexOf(data, min, indexArray, data.length - 1);
            int temp = data[index];
            data[index] = data[indexArray];
            data[indexArray] = temp;
        }
        return data;
    }
}
