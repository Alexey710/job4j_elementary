package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class Counter2Test {

    @Test
    public void sumFrom3To8Is33() {
        Assert.assertEquals(33, Counter2.sum(3, 8));
    }

    @Test
    public void sumByEvenFrom3To8Is18() {
        Assert.assertEquals(18, Counter2.sumByEven(3, 8));
    }
}