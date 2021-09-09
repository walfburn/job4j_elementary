package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static ru.job4j.loop.Counter.*;

public class CounterTest {

    @Test
    public void sumTest() {
        int start = 0;
        int finish = 10;
        int result = sum(start, finish);
        int expected = 55;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void sumByEvenTest() {
        int start = 1;
        int finish = 10;
        int result = sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void sumByEvenMinus() {
        int start = -3;
        int finish = 25;
        int result = sumByEven(start, finish);
        int expected = 154;
        Assert.assertEquals(result, expected);
    }
}