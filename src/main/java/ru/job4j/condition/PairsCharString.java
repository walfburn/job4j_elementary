package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String left, String right) {
        if (left.isEmpty() && right.isEmpty()) {
            return true;
        } else if (left.charAt(0) == right.charAt(right.length() - 1) && left.charAt(left.length() - 1) == right.charAt(0)) {
            return true;
        }
        return false;
    }
}
