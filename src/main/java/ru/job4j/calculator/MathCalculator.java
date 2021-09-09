package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiple(double one, double two) {
        return MathFunction.sum(one, two)
                + MathFunction.multiple(one, two);
    }

    public static double substAndSegment(double one, double two) {
        return MathFunction.subtract(one, two)
                + MathFunction.segment(one, two);
    }

    public static double sumAll(double one, double two) {
        return MathFunction.sum(one, two) + MathFunction.multiple(one, two)
                + MathFunction.subtract(one, two) + MathFunction.segment(one, two);
    }

    public static void main(String[] args) {
        System.out.println("Result sumAndMultiple: " + sumAndMultiple(5, 10));
        System.out.println("Result substAndSegment: " + substAndSegment(110, 21));
        System.out.println("Result sumAll: " + sumAll(17, 9));
    }

}
