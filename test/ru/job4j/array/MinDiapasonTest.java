package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class MinDiapasonTest {

    @Test
    public void findMin3() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int expected = 3;
        int start = 0;
        int finish = 0;
        int result = MinDiapason.findMin(input, start, finish);
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void findMin4() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int expected = 3;
        int start = 0;
        int finish = 1;
        int result = MinDiapason.findMin(input, start, finish);
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void findMin1() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int expected = 1;
        int start = 0;
        int finish = 4;
        int result = MinDiapason.findMin(input, start, finish);
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void findMin2() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int expected = 2;
        int start = 3;
        int finish = 4;
        int result = MinDiapason.findMin(input, start, finish);
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void findMin5() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int expected = 5;
        int start = 4;
        int finish = 4;
        int result = MinDiapason.findMin(input, start, finish);
        Assert.assertThat(result, is(expected));
    }
}