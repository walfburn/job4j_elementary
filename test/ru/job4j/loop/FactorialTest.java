package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static ru.job4j.loop.Factorial.*;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void calcOne() {
        int result = calc(5);
        int expected = 120;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void calcTwo() {
        int result = calc(0);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }
}