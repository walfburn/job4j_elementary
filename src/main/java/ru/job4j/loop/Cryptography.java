package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.length() >= 0 && s.length() <= 4) {
                return s;
            } //else
        }
        return "123";
    }
}
