package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] array = {{1, -2}, {1, 2}};
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {{1, 0}, {1, 2}};
        assertArrayEquals(result, expected);
    }

    @Test
    public void skipTwo() {
        int[][] array = {{1, -2}, {1, 2, -3}, {1, -2, 3, -4}, {1, 2, -3, -4, 5}};
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {{1, 0}, {1, 2, 0}, {1, 0, 3, 0}, {1, 2, 0, 0, 5}};
        assertArrayEquals(result, expected);
    }
}