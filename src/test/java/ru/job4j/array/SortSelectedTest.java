package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{4, 2, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 4, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort7() {
        int[] data = new int[]{5, 8, 2, 3, 9, 1, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 5, 8, 9, 12};
        Assert.assertArrayEquals(expected, result);
    }
}