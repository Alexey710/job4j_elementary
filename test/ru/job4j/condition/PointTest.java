package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to02then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void when00to03then3() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        double out = a.distance(b);
        double expected = 3;
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void when00to04then4() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        double out = a.distance(b);
        double expected = 4;
        Assert.assertEquals(expected, out, 0);
    }
}