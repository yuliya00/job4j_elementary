package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
     public void whenP6K2Square2() {
            int expected = 2;
            int p = 6;
            double k = 2;
            double out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.01);
            expected = 1;
            p = 4;
            k = 1;
            out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.01);
            expected = 8;
            p = 12;
            k = 2;
            out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.01);
     }
}