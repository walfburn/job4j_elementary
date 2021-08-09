package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String reuslt;
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                reuslt = "Исходное число делится на 6.";
            } else {
                reuslt = "Исходное число делится на 3, но не является четным.";
            }
        } else {
            if (number % 2 != 0) {
                reuslt = "Исходное число не делится на 3 и не является четным.";
            } else {
                reuslt = "Исходное число не делится на 3, но является четным.";
            }
        }
        return reuslt;
    }
}
