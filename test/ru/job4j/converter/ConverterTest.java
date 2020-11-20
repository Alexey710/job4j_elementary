package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void rubleToDollar() {
        int in = 140;
        float expected = 2.33f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0);
    }
}