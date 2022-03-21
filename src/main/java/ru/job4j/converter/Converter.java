package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(300);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("300 rubles are " + dollar + " dollar.");
        float valueOne = 140;
        float valueTwo = 300;
        float expectedOne = 2;
        float expectedTwo = 5;
        float outOne = Converter.rubleToEuro(valueOne);
        float oneTwo = Converter.rubleToDollar(valueTwo);
        boolean passedOne = expectedOne == outOne;
        boolean passedTwo = expectedTwo == oneTwo;
        System.out.println("140 рублей это 2 евро. Результат:  " + passedOne);
        System.out.println("300 рублей это 5 долларов. Результат: " + passedTwo);
    }
}
