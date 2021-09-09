package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int result) {
        if (left + right == result) {
            return "added";
        }
        if (left - right == result) {
            return "subtracted";
        }
        if (left * right == result) {
            return "multiplied";
        }
        if (left / right == result) {
            return "divided";
        }
        return "none";
    }
}
