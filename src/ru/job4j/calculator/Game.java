package ru.job4j.calculator;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        if ((percent * prize) > pay) {
            return (int)((percent * prize) - pay);
        } else {
            return 0;
        }
    }
}
