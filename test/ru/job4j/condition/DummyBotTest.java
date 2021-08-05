package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void answerGreet() {
        String in = "Привет, Бот.";
        String out = DummyBot.answer(in);
        String expected = "Привет, умник.";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void answerBye() {
        String in = "Пока.";
        String out = DummyBot.answer(in);
        String expected = "До скорой встречи.";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void answerUnknown() {
        String in = "Такого не может быть.";
        String out = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, out);
    }
}