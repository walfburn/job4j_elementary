package ru.job4j.loop;

public class LoopFor {
    public static void main(String[] args) {
        int index;
        boolean result;
        for (index = 5; result = index >= 5 && index < 10; index++) {
            System.out.println(index);
        }
        System.out.println(index);
        System.out.println(result);
    }
}
