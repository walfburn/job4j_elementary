package ru.job4j.condition;

public class X2 {

    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 8;
        int x = 0;
        int result = X2.calc(a, b, c, x);
        System.out.println(result);
    }
}
