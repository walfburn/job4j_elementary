package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && number % 2 != 0) {
                prime = true;
                break;
            } else {
                prime = false;
            }
        }
        System.out.println(prime);
        return prime;
    }
}
