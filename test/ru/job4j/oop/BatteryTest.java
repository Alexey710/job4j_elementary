package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class BatteryTest {

    @Test
    public void exchange() {
        Battery first = new Battery(100);
        Battery second = new Battery(50);
        first.exchange(second);
        Assert.assertThat(first.getLoad(), is(0));
        Assert.assertThat(second.getLoad(), is(150));
    }
}