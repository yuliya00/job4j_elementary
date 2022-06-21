package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 1;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 7, 3, 4, 5, 6, 2};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to8() {
        int[] input = {2, 4, 6, 8, 10, 12};
        int source = 4;
        int dest = input.length - 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 4, 6, 10, 8, 12};
        Assert.assertArrayEquals(expected, result);
    }
}