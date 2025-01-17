package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int index = 0;
        int summ = money - price;
        for (int coin : coins) {
            while (summ  >= coin) {
                summ = summ - coin;
                result[index] = coin;
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
