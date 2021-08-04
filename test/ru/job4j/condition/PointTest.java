package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceTestOne() {
        int x1 = 1;
        int x2 = 1;
        int y1 = 0;
        int y2 = 1;
        double expected = 1;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTestTwo() {
        int x1 = 1;
        int x2 = 0;
        int y1 = 1;
        int y2 = 0;
        double expected = 1.41;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTestThree() {
        int x1 = 1;
        int x2 = 2;
        int y1 = 1;
        int y2 = 4;
        double expected = 3.16;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}