package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2ThenS2() {
        int p = 6, k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0);
    }
}