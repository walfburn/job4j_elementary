package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int minimum = array[start];
        for (int index = start; index <= finish; index++) {
            if (minimum > array[index]) {
                minimum = array[index];
            }
        }
        return minimum;
    }
}
