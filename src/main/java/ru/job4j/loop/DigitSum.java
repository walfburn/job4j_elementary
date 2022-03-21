package ru.job4j.loop;

public class DigitSum {
    public static int sum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }
}
