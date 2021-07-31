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
        float in = 140;
        float in2 = 300;
        float expected = 2;
        float expected2 = 5;
        float out = Converter.rubleToEuro(in);
        float out2 = Converter.rubleToDollar(in2);
        boolean passed = expected == out;
        boolean passed2 = expected2 == out2;
        System.out.println("140 рублей это 2 евро. Результат:  " + passed);
        System.out.println("300 рублей это 5 долларов. Результат: " + passed2);
    }
}
