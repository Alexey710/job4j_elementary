package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class SquareTest {

    @Test
    public void calculate() {
        int[] in = new int[] {0, 1, 4, 9, 16};
        int[] out = Square.calculate(5);
        Assert.assertThat(out, is(in));
    }
}