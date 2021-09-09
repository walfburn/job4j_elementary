package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int countSL = 0;
        while (section  <= length) {
            length = length - section;
            countSL++;
        }
        return countSL;
    }
}
