package ru.job4j.condition;

public class Max {

    public static int max(int one, int two) {
        return Math.max(one, two);
    }

    public static int max(int one, int two, int three) {
        return max(one, max(two, three));
    }

    public int max(int one, int two, int three, int four) {
        return max(max(one, two), max(three, four));
    }

    public static void main(String[] args) {
        int numberMax = Max.max(13, 7);
        System.out.println("Максимальное число : " + numberMax);
    }
}
