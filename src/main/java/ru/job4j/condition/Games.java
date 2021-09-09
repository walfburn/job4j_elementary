package ru.job4j.condition;

public class Games {

    public static void permission(boolean allowParents, boolean hasMoney) {
        if (allowParents && hasMoney) {
            System.out.println("I can go to game club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(false, true);
        Games.permission(false, false);
    }
}
