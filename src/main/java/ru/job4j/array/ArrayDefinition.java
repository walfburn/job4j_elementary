package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер ages = " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер surnames = " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер prices = " + prices.length);
        String[] names = new String[4];
        names[0] = "Vladimir";
        System.out.println(names[0]);
        names[1] = "Dmitry";
        System.out.println(names[1]);
        names[2] = "Daria";
        System.out.println(names[2]);
        names[3] = "Alexander";
        System.out.println(names[3]);
    }
}
