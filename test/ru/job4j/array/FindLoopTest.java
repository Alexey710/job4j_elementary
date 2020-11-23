package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void indexOf5() {
        int[] in = new int[] {0, 1, 4, 9, 16};
        int out = FindLoop.indexOf(in, 5);
        assertThat(out, is(-1));
    }

    @Test
    public void indexOf1() {
        int[] in = new int[] {0, 1, 4, 9, 16};
        int out = FindLoop.indexOf(in, 1);
        assertThat(out, is(1));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
}