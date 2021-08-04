package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 186;
        double expected = 98.9;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 00.1);
    }

    @Test
    public void womanWeight() {
        short in = 155;
        double expected = 51.7;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 00.1);
    }
}