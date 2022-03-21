package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int result = 1;
        for (int index = 1; index <= n; index++) {
            result = (result * a);
        }
        return result;
    }
}
