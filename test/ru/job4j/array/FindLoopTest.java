package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class FindLoopTest {

    @Test
    public void indexOf5() {
        int[] in = new int[] {0, 1, 4, 9, 16};
        int out = FindLoop.indexOf(in, 5);
        Assert.assertThat(out, is(-1));
    }

    @Test
    public void indexOf1() {
        int[] in = new int[] {0, 1, 4, 9, 16};
        int out = FindLoop.indexOf(in, 1);
        Assert.assertThat(out, is(1));
    }
}