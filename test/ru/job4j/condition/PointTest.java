package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to02then2() {
        double out = Point.distance(0, 0, 0, 2);
        double expected = 2;
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void when00to03then3() {
        double out = Point.distance(0, 0, 0, 3);
        double expected = 3;
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void when00to04then4() {
        double out = Point.distance(0, 0, 0, 4);
        double expected = 4;
        Assert.assertEquals(expected, out, 0);
    }
}