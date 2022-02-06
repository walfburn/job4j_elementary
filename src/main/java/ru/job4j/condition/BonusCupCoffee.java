package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int number) {
        if (count > number) {
            return  count + (count / number);
        } else {
            return 0;
        }
    }
}
