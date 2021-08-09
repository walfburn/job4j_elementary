package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name = switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Ошибка";
        };
        return name;
    }

    public static void main(String[] args) {
        String day = SwitchWeek.nameOfDay(3);
        System.out.println(day);
    }
}
