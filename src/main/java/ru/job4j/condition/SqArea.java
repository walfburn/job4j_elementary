package ru.job4j.condition;

public class SqArea {

    public static double square(double k, double p) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = SqArea.square(2, 6);
        System.out.println("p = 6, k = 2, s = " + result);
    }
}
