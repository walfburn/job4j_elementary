package ru.job4j.loop;

public class Cryptography {
    public static String code(String source) {
        for (int index = 0; index < source.length(); index++) {
            if (source.length() >= 0 && source.length() <= 4) {
                return source;
            }
        }
        return "123";
    }
}
