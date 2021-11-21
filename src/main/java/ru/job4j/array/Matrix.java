package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] == 0) {
                    array[row][cell] = (row + 1) * (cell + 1);
                } else {
                    array[row][cell] = row * cell;
                }
            }
        }
        return array;
    }
}
