package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value){
        float rls = value / 70;
        return rls;
    }

    public static float rubleToDollar(float value){
        float rls = value / 60;
        return rls;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(150);
        float dollar = Converter.rubleToDollar(300);
        System.out.println("150 rubles are " + euro + " euro");
        System.out.println("300 rubles are " + dollar + " dollar");
    }
}
