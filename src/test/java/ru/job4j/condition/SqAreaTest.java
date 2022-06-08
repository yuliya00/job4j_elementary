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
     }

     @Test
     public void whenP4K1Square1() {
         int expected = 1;
         int p = 4;
         double k = 1;
         double out = SqArea.square(p, k);
         Assert.assertEquals(expected, out, 0.01);
     }

     @Test
     public void whenP12K2Square8() {
        int expected = 8;
        int p = 12;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
     }
}