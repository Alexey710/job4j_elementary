package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to02then2() {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void when00to03then3() {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 3;
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void when00to04then4() {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 4;
        Assert.assertEquals(expected, out, 0);
    }
}