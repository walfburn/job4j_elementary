package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static ru.job4j.condition.Max.*;

public class MaxTest {

    @Test
    public void oneMax() {
        int one = 1;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void twoMax() {
        int one = 5;
        int two = 3;
        int result = Max.max(one, two);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void oneEqualTwo() {
        int one = 1;
        int two = 1;
        int result = Max.max(one, two);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void threeMax() {
        int one = 1;
        int two = 2;
        int three = 3;
        int expected = 3;
        int result = Max.max(one, max(two, three));
        Assert.assertEquals(result, expected);
    }

    @Test
    public void fourMax() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 5;
        int expected = 5;
        int result = Max.max(max(one, two), max(three, four));
        Assert.assertEquals(result, expected);
    }
}