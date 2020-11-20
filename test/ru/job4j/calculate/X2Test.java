package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA1B1C2X1Then3() {
        int a = 1, b = 1, c = 1, x = 1;
        int result = X2.calc(a, b, c, x);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0, b = 1, c = 1, x = 1;
        int result = X2.calc(a, b, c, x);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1, b = 1, c = 0, x = 1;
        int result = X2.calc(a, b, c, x);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenA1B1C1X0Then2() {
        int a = 1, b = 1, c = 1, x = 0;
        int result = X2.calc(a, b, c, x);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}