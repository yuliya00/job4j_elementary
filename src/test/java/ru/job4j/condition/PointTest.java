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
            expected = 2.82;
            x1 = 2;
            y1 = 2;
            x2 = 4;
            y2 = 4;
            out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
            expected = 4.24;
            x1 = 3;
            x2 = 6;
            y2 = 5;
            out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);

    }

}