package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 187;
        double result = Fit.man(in);
        double expected = 100.05;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void womanWeight() {
        short in = 167;
        double result = Fit.man(in);
        double expected = 77.05;
        Assert.assertEquals(expected, result, 0.01);
    }
}