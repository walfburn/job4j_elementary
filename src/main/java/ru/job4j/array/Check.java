package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            boolean temp = data[0];
            if (temp != data[index]) {
                return false;
            }
        }
        return result;
    }
}
