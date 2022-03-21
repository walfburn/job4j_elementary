package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = x * 10;
        return y;
    }

    public static void main(String[] args) {
        int resultFirst = MathFunc.func1(3);
        int resultSecond = MathFunc.func2(5);
        int resultThird = MathFunc.func1(100);
        System.out.println(resultFirst + resultSecond);
        System.out.println(resultThird);
    }
}
