package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c){
        double p = (a + b+ c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double x = TrgArea.area(3,2,4);
        System.out.println("area (3,2,4) = " + x);
    }
}
