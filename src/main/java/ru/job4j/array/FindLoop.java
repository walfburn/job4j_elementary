package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rls = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rls = index;
                break;
            }
        }
        return rls;
    }
}
