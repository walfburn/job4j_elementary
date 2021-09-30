package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void backChet() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expected = new int[] {4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void backNechet() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }
}