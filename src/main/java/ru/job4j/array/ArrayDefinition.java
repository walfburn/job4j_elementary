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
        names[1] = "Dmitry";
        names[2] = "Daria";
        names[3] = "Alexander";
        for (String name: names) {
            System.out.println(name);
        }
    }
}
