package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

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

    @Test
    public void distance3dZ() {
        Point a = new Point(0, 0, 100);
        Point b = new Point(0, 0, 10);
        double out = a.distance3d(b);
        double expected = 90;
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void distance3dX() {
        Point a = new Point(100, 0, 0);
        Point b = new Point(1, 0, 0);
        double out = a.distance3d(b);
        double expected = 99;
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void distance3dY() {
        Point a = new Point(0, 100, 3);
        Point b = new Point(0, 16, 0);
        double out = a.distance3d(b);
        double expected = 84;
        Assert.assertEquals(expected, out, 0.1);
    }
}