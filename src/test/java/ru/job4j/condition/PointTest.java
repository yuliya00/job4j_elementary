package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
     public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
     }

     @Test
     public void when22to44then2() {
         double expected = 2.82;
         int x1 = 2;
         int y1 = 2;
         int x2 = 4;
         int y2 = 4;
         double out = Point.distance(x1, y1, x2, y2);
         Assert.assertEquals(expected, out, 0.01);
     }

     @Test
     public void when32to65then4() {
         double expected = 4.24;
         int x1 = 3;
         int y1 = 2;
         int x2 = 6;
         int y2 = 5;
         double out = Point.distance(x1, y1, x2, y2);
         Assert.assertEquals(expected, out, 0.01);
     }

}