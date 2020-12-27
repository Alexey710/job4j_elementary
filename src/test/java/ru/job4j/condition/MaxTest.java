package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void when2And3Max3() {
        Assert.assertThat(Max.max(2, 3), is(3));
    }

    @Test
    public void when4And2Max4() {
        Assert.assertThat(Max.max(4, 2), is(4));
    }

    @Test
    public void when4And4Max4() {

        Assert.assertThat(Max.max(4, 4), is(4));
    }

    @Test
    public void when3Max4() {

        Assert.assertThat(Max.max(4, 3, 2), is(4));
    }

    @Test
    public void when4Max5() {

        Assert.assertThat(Max.max(4, 3, 2, 5), is(5));
    }

    @Test
    public void when2and1Max10() {

        Assert.assertThat(Max.max(Max.max(10, 3), 5), is(10));
    }
}