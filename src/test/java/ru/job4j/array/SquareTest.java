package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void calculate() {
        int bound = 3;
        int[] actual = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void calculate2() {
        int bound = 5;
        int[] actual = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        Assert.assertArrayEquals(actual, expected);
    }
}