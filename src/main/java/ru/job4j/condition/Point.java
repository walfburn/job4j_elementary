package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int x2, int y1, int y2) {
        double one = (x2 - x1);
        double two = (y2 - y1);
        double third = Math.pow(one, 2) + Math.pow(two, 2);
        return Math.sqrt(third);
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 2, 3, 1);
        double result2 = Point.distance(4, 0, 1, 3);
        System.out.println(result);
        System.out.println(result2);
    }
}
