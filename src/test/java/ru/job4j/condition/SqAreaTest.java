package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squareTestOne() {
        double k = 6;
        int p = 10;
        double expected = 3.06;
        double out = SqArea.square(k, p);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void squareTestTwo() {
        double k = 2;
        int p = 6;
        double expected = 2;
        double out = SqArea.square(k, p);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void squareTestThree() {
        double k = 1;
        double p = 4;
        double expected = 1;
        double out = SqArea.square(k, p);
        Assert.assertEquals(expected, out, 0.01);
    }
}