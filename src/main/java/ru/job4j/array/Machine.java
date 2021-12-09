package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int index = 0;
        int summ = money - price;
        for (; size < coins.length; size++) {
            while (summ  >= coins[size]) {
                summ = summ - coins[size];
                result[index] = coins[size];
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
