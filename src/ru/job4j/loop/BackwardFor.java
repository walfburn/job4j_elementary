package ru.job4j.loop;

public class BackwardFor {
    public static void out(int m, int n) {
        for (; n < m; m--) {
            System.out.println(m);
        }
    }
}
