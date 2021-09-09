package ru.job4j.condition;

public class DummyBot {

    public static String answer(String questions) {
        String rls = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(questions)) {
            rls = "Привет, умник.";
        } else if ("Пока.".equals(questions)) {
            rls = "До скорой встречи.";
        }
        return rls;
    }

    public static void main(String[] args) {
        String rls = DummyBot.answer("Привет, Бот.");
        System.out.println(rls);
        rls = DummyBot.answer("Пока.");
        System.out.println(rls);
    }
}
