package ru.job4j.condition;

public class Max {

    public static int max(int one, int two) {
        return one > two ? one : two;
    }

    public static void main(String[] args) {
        int numberMax = Max.max(13, 7);
        System.out.println("Максимальное число : " + numberMax);
    }
}
