package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceTestOne() {
        Point a = new Point(1, 0);
        Point b = new Point(1, 1);
        double expected = 1;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTestTwo() {
        Point a = new Point(1, 1);
        Point b = new Point(0, 0);
        double expected = 1.41;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void distanceTestThree() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 4);
        double expected = 3.16;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}